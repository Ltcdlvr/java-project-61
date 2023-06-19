package hexlet.code.games;

import java.util.Random;

public class GCD {

    private static String answer = "?";
    private static int a = 0;
    private static int b = 0;
    private static final int BOUND = 100;
    private static final Random RAND_GENERATOR = new Random();

    private static int getGCD(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }

    private static void generateNewInput() {
        a = RAND_GENERATOR.nextInt(BOUND);
        b = RAND_GENERATOR.nextInt(BOUND);
        answer = String.valueOf(getGCD(a, b));
    }

    public static String getQuestion() {
        generateNewInput();
        return a + " " + b;
    }

    public static String getAnswer() {
        return answer;
    }
}
