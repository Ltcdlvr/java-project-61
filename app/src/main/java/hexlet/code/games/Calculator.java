package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {

    private static final int BOUND = 10;
    private static final Character[] OPERATIONS = {'+', '-', '*'};
    private static final String RULES = "What is the result of the expression?";

    private static String[] getCalculation(int a, int b, char operator) {
        switch (operator) {
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
        int a = RandGenerator.getRandomInt(BOUND);
        int b = RandGenerator.getRandomInt(BOUND);
        char operator = OPERATIONS[RandGenerator.getRandomInt(OPERATIONS.length)];
        return getCalculation(a, b, operator);
    }

    private static String[][] getRounds(int roundsAmount) {
        var rounds = new String[roundsAmount][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }

    public static void runGame() {
        Engine.runGame(Calculator.RULES, Calculator.getRounds(Engine.GAME_ROUNDS));
    }
}
