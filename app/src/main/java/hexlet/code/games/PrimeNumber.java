package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumber {

    private static final int BOUND = 1000;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

    private static String[] generateRound() {
        int n = RandGenerator.getRandomInt(BOUND);
        String answer = isPrime(n) ? "yes" : "no";
        return new String[]{String.valueOf(n), answer};
    }

    private static String[][] getRounds(int roundsAmount) {
        var rounds = new String[roundsAmount][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }

    public static void runGame() {
        Engine.runGame(PrimeNumber.RULES, PrimeNumber.getRounds(Engine.GAME_ROUNDS));
    }
}
