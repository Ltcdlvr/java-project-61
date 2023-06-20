package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvenNumber {

    private static final int BOUND = 1000;
    private static final Random RAND_GENERATOR = new Random();
    private static final Integer GAME_ROUNDS = 3;

    private static List<String> generateRound() {
        int n = RAND_GENERATOR.nextInt(BOUND);
        String answer = "?";

        if (n % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return List.of(String.valueOf(n), answer);
    }

    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static ArrayList<List<String>> getRounds() {
        var rounds = new ArrayList<List<String>>();
        for (int i = 0; i < GAME_ROUNDS; i++) {
            rounds.add(generateRound());
        }
        return rounds;
    }
}
