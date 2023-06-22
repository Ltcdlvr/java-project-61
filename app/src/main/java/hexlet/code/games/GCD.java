package hexlet.code.games;

public class GCD {

    private static final int BOUND = 100;
    public static final String RULES = "Find the greatest common divisor of given numbers.";

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

    private static String[] generateRound() {
        int a = RandGenerator.getRandomInt(BOUND) + 1;
        int b = RandGenerator.getRandomInt(BOUND) + 1;
        return new String[]{a + " " + b, String.valueOf(getGCD(a, b))};
    }

    public static String[][] getRounds(int roundsAmount) {
        var rounds = new String[roundsAmount][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }
}
