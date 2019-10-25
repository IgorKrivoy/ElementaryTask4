package task.controller;

import task.model.*;
import task.service.*;
import task.util.*;

import java.io.IOException;

public class ParserController {
    FileModel fileModel;
    ParserService parserService = new ParserService();
    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();

    public void run() {
        while (true) {
            outPut.getRunInfo();
            String[] input = validator.inputContent(this.input.getString());
            if (input.length != 1) {

                createNewFileModel(input[0]);

                if (validator.doesFileExist(fileModel.getFile())) {
                    choiceService(input);
                } else {
                    outPut.fileExistErrorInfo();
                }
                outPut.getAskForContinue();
                if (!validator.continueRequest(this.input.getString())) {
                    break;
                }
            } else {
                outPut.getInfoOfMistakeInput();
            }
        }
    }

    public void createNewFileModel(String url) {
        try {
            fileModel = new FileModel(url);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void choiceService(String[] input) {
        if (validator.isEmptyFile(fileModel.getFile())) {
            if (input.length == 2) {
                outPut.getInfoChoiceOfRepetitions();
                try {
                    int count;
                    count = parserService.countOfRepetitions(validator.inputContent(parserService.readFromFile(fileModel.getFile())),
                            input[1]);
                    outPut.printResultOfCount(count);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } else if (input.length == 3) {
                outPut.getInfoChoiceOfReplace();
                if (parserService.replaceString(fileModel.getFile(), input[1], input[2])) {
                    outPut.printResultOfReplace();
                }
            }
        }
    }


}
