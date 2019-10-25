package task.model;

import java.io.File;
import java.io.IOException;

public class FileModel {

    File file;

    public FileModel(String link) throws IOException {
        this.file = new File(link);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
