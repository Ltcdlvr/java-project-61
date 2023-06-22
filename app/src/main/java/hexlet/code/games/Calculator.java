package hexlet.code.games;

public class Calculator {

    private static final int BOUND = 10;
    private static final Character[] OPERATIONS = {'+', '-', '*'};
    public static final String RULES = "What is the result of the expression?";

    private static String[] getCalculation(int a, int b) {
        char randomSymbol = OPERATIONS[RandGenerator.getRandomInt(OPERATIONS.length)];

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
        int a = RandGenerator.getRandomInt(BOUND);
        int b = RandGenerator.getRandomInt(BOUND);
        return getCalculation(a, b);
    }

    public static String[][] getRounds(int roundsAmount) {
        var rounds = new String[roundsAmount][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }
}
