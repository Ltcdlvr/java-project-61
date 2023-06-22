package hexlet.code.games;

public class EvenNumber {

    private static final int BOUND = 1000;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[] generateRound() {
        int n = RandGenerator.getRandomInt(BOUND);
        String answer = "?";

        if (n % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return new String[]{String.valueOf(n), answer};
    }

    public static String[][] getRounds(int roundsAmount) {
        var rounds = new String[roundsAmount][2];
        for (int i = 0; i < roundsAmount; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }
}
