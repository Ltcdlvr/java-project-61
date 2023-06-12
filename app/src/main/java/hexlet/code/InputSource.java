package hexlet.code;

import java.util.Scanner;

public class InputSource {

    private static InputSource instance;
    private Scanner scanner;

    private InputSource() {
        scanner = new Scanner(System.in);
    }

    public static synchronized InputSource getInstance() {
        if (instance == null) {
            instance = new InputSource();
        }
        return instance;
    }

    public String getStringAnswer() {
        return scanner.next();
    }

    public Integer getIntAnswer() {
        return Integer.valueOf(scanner.next());
    }
}
