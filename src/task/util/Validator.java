package task.util;

import java.io.File;

public class Validator {

    public boolean isEmptyFile(File file) {
        if (file.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean continueRequest(String answer) {
        answer = answer.toUpperCase();
        if (answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }

    public boolean doesFileExist(File file) {
        if (file.exists() && file.isFile())
            return true;
        else
            //output.fileError();
            return false;
    }

    public String[] inputContent(String string) {
        String[] content = string.split(" ");
        return content;
    }
}
