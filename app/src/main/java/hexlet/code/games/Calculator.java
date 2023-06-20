package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calculator {

    private static final int BOUND = 1000;
    private static final Character[] OPERATIONS = {'+', '-', '*'};
    private static final Random RAND_GENERATOR = new Random();

    private static List<String> generateRound() {
        String answer = "?";
        char operation = '?';
        int a = RAND_GENERATOR.nextInt(BOUND);
        int b = RAND_GENERATOR.nextInt(BOUND);

        int symbolNumber = RAND_GENERATOR.nextInt(OPERATIONS.length);
        switch (symbolNumber) {
            case 0 -> {
                operation = OPERATIONS[0];
                answer = String.valueOf(a + b);
                break;
            }
            case 1 -> {
                operation = OPERATIONS[1];
                answer = String.valueOf(a - b);
                break;
            }
            default -> {
                operation = OPERATIONS[2];
                answer = String.valueOf(a * b);
                break;
            }
        }
        return List.of(a + " " + operation + " " + b, answer);
    }

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static ArrayList<List<String>> getRounds(int roundsAmount) {
        var rounds = new ArrayList<List<String>>();
        for (int i = 0; i < roundsAmount; i++) {
            rounds.add(generateRound());
        }
        return rounds;
    }
}
