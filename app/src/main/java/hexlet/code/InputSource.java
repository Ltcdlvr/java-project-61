package hexlet.code;

import java.util.Scanner;

public final class InputSource {

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

    public static synchronized void close() {
        if (instance != null) {
            instance.scanner.close();
            instance = null;
        }
    }

    public String getStringAnswer() {
        return scanner.next();
    }

    public Integer getIntAnswer() {
        return Integer.valueOf(scanner.next());
    }
}
