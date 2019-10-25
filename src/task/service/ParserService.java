package task.service;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import task.model.FileModel;
import task.model.Name;

import java.io.*;

public class ParserService {

    public String readFromFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        return bufferedReader.readLine();
    }

    public void writeToFile(File file, String replaceString) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(replaceString);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public boolean replaceString(File file, String findString, String replaceString) {
        try {
            writeToFile(file, readFromFile(file).replaceAll(findString, replaceString));
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public int countOfRepetitions(String[] fileContent, String find) {
        int count = 0;
        for (int i = 0; i < fileContent.length; i++) {
            if (fileContent[i].equals(find)) {
                count++;
            }
        }
        return count;
    }
}
