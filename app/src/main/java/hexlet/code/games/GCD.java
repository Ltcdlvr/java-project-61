package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GCD {

    private static final int BOUND = 100;
    private static final Random RAND_GENERATOR = new Random();
    private static final Integer GAME_ROUNDS = 3;

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

    private static List<String> generateRound() {
        int a = RAND_GENERATOR.nextInt(BOUND);
        int b = RAND_GENERATOR.nextInt(BOUND);
        return List.of(a + " " + b, String.valueOf(getGCD(a, b)));
    }

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static ArrayList<List<String>> getRounds() {
        var rounds = new ArrayList<List<String>>();
        for (int i = 0; i < GAME_ROUNDS; i++) {
            rounds.add(generateRound());
        }
        return rounds;
    }
}
