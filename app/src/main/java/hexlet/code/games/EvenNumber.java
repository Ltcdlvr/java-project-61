package hexlet.code.games;

import java.util.Random;

public class EvenNumber {
    private static String answer = "?";
    private static int n = 0;
    private static final int BOUND = 1000;
    private static final Random RAND_GENERATOR = new Random();

    private static void generateNewInput() {
        n = RAND_GENERATOR.nextInt(BOUND);

        if (n % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
    }

    public static String getQuestion() {
        generateNewInput();
        return String.valueOf(n);
    }

    public static String getAnswer() {
        return answer;
    }
}
