package hexlet.code.games;

import java.util.Random;

public class Progression {

    private static final int BOUND = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final Random RAND_GENERATOR = new Random();
    public static final String RULES = "What number is missing in the progression?";;

    private static String[] generateRound() {
        int base = RAND_GENERATOR.nextInt(BOUND);
        int step = RAND_GENERATOR.nextInt(BOUND);
        int length = RAND_GENERATOR.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        int secretIndex = RAND_GENERATOR.nextInt(length);
        String[] progression = new String[length];


        for (int curIndex = 0; curIndex < length; curIndex++) {
            progression[curIndex] = String.valueOf(base + step * curIndex);
        }

        String answer = progression[secretIndex];
        progression[secretIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, answer};
    }

    public static String[][] getRounds(int roundsAmount) {
        var rounds = new String[3][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }
}
