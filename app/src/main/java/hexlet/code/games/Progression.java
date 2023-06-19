package hexlet.code.games;

import java.util.Random;

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
        String[] progression = new String[length];


        for (int curIndex = 0; curIndex < length; curIndex++) {
            progression[curIndex] = String.valueOf(base + step * curIndex);
        }

        answer = progression[secretIndex];
        progression[secretIndex] = "..";
        question = String.join(" ", progression);
    }

    public static String getQuestion() {
        generateNewInput();
        return question;
    }

    public static String getAnswer() {
        return answer;
    }
}
