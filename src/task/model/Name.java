package task.model;

import java.io.Serializable;

public class Name implements Serializable {
    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
