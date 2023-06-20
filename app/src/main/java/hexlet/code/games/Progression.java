package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {

    private static final int BOUND = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 12;
    private static final Random RAND_GENERATOR = new Random();
    private static final Integer GAME_ROUNDS = 3;

    private static List<String> generateRound() {
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
        return List.of(question, answer);
    }

    public static String getRules() {
        return "What number is missing in the progression?";
    }

    public static ArrayList<List<String>> getRounds() {
        var rounds = new ArrayList<List<String>>();
        for (int i = 0; i < GAME_ROUNDS; i++) {
            rounds.add(generateRound());
        }
        return rounds;
    }
}
