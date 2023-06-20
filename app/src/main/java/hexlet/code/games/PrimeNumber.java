package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumber {

    private static final int BOUND = 1000;
    private static final Random RAND_GENERATOR = new Random();
    private static final Integer GAME_ROUNDS = 3;

    private static boolean isPrime(int number) {
        int absNumber = Math.abs(number);
        if (absNumber < 2) {
            return false;
        }
        for (int it = 2; it < Math.sqrt(absNumber); it++) {
            if (absNumber % it == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<String> generateRound() {
        int n = RAND_GENERATOR.nextInt(BOUND);
        String answer = "no";

        if (isPrime(n)) {
            answer = "yes";
        }

        return List.of(String.valueOf(n), answer);
    }

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static ArrayList<List<String>> getRounds() {
        var rounds = new ArrayList<List<String>>();
        for (int i = 0; i < GAME_ROUNDS; i++) {
            rounds.add(generateRound());
        }
        return rounds;
    }
}
