package hexlet.code.games;

import java.util.Random;

public class Calculator {

    private static final int BOUND = 10;
    private static final Character[] OPERATIONS = {'+', '-', '*'};
    private static final Random RAND_GENERATOR = new Random();
    public static final String RULES = "What is the result of the expression?";

    private static String[] getCalculation(int a, int b) {
        char randomSymbol = OPERATIONS[RAND_GENERATOR.nextInt(OPERATIONS.length)];

        switch (randomSymbol) {
            case '+' -> {
                return new String[]{a + " + " + b, String.valueOf(a + b)};
            }
            case '-' -> {
                return new String[]{a + " - " + b, String.valueOf(a - b)};
            }
            default -> {
                return new String[]{a + " * " + b, String.valueOf(a * b)};
            }
        }
    }

    private static String[] generateRound() {
        int a = RAND_GENERATOR.nextInt(BOUND);
        int b = RAND_GENERATOR.nextInt(BOUND);
        return getCalculation(a, b);
    }

    public static String[][] getRounds(int roundsAmount) {
        var rounds = new String[3][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }
}
