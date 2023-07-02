package hexlet.code.games;

import hexlet.code.Engine;

public class EvenNumber {

    private static final int BOUND = 1000;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[] generateRound() {
        int n = RandGenerator.getRandomInt(BOUND);
        String answer = n % 2 == 0 ? "yes" : "no";
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
        Engine.runGame(EvenNumber.RULES, EvenNumber.getRounds(Engine.GAME_ROUNDS));
    }
}
