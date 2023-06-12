package hexlet.code.games;

import java.util.List;
import java.util.Random;

public class GCD {
    private static String answer = "?";
    private static int a = 0;
    private static int b = 0;
    private static final int BOUND = 100;
    private static final Random RAND_GENERATOR = new Random();
    private static final List<Integer> PRIME_NUMBERS = List.of(1, 2, 3, 5, 7, 11, 13, 17, 19, 23);

    private static void generateNewInput() {
        int core = RAND_GENERATOR.nextInt(BOUND);
        int firstIndex = RAND_GENERATOR.nextInt(PRIME_NUMBERS.size());
        int secondIndex = (firstIndex + 1) % PRIME_NUMBERS.size();

        a = core * PRIME_NUMBERS.get(firstIndex);
        b = core * PRIME_NUMBERS.get(secondIndex);
        answer = String.valueOf(core);
    }

    public static String getQuestion() {
        generateNewInput();
        return a + " " + b;
    }

    public static String getAnswer() {
        return answer;
    }
}
