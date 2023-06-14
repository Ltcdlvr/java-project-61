package hexlet.code.games;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {

    private static String answer = "?";
    private static String question = "?";
    private static final int BOUND = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final Random RAND_GENERATOR = new Random();

    private static void generateNewInput() {
        int base = RAND_GENERATOR.nextInt(BOUND);
        int step = RAND_GENERATOR.nextInt(BOUND);
        int length = RAND_GENERATOR.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        int secretIndex = RAND_GENERATOR.nextInt(length);
        StringJoiner result = new StringJoiner(" ");

        for (int curIndex = 0; curIndex < length; curIndex++) {
            String curValue = String.valueOf(base + step * curIndex);
            if (curIndex == secretIndex) {
                answer = curValue;
                result.add("..");
            } else {
                result.add(curValue);
            }
        }

        question = result.toString();
    }

    public static String getQuestion() {
        generateNewInput();
        return question;
    }

    public static String getAnswer() {
        return answer;
    }
}
