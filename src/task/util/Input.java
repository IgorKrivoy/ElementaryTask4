package task.util;

import java.util.Scanner;

public class Input {

    Scanner scan;

    public Input() {
        scan = new Scanner(System.in);
    }

    public String getString() {
        return scan.nextLine();
    }
}
