package hexlet.code.games;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Calculator {

    private static String answer = "?";
    private static int a = 0;
    private static int b = 0;
    private static char operation = '?';
    private static final int BOUND = 1000;
    private static final List<Character> OPERATIONS = Collections.unmodifiableList(List.of('+', '-', '*'));
    private static final Random RAND_GENERATOR = new Random();

    private static void generateNewInput() {
        a = RAND_GENERATOR.nextInt(BOUND);
        b = RAND_GENERATOR.nextInt(BOUND);

        int symbolNumber = RAND_GENERATOR.nextInt(OPERATIONS.size());
        switch (symbolNumber) {
            case 0 -> {
                operation = OPERATIONS.get(0);
                answer = String.valueOf(a + b);
                break;
            }
            case 1 -> {
                operation = OPERATIONS.get(1);
                answer = String.valueOf(a - b);
                break;
            }
            default -> {
                operation = OPERATIONS.get(2);
                answer = String.valueOf(a * b);
                break;
            }
        }
    }

    public static String getQuestion() {
        generateNewInput();
        return a + " " + operation + " " + b;
    }

    public static String getAnswer() {
        return answer;
    }

}
