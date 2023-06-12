package hexlet.code.games;

import java.util.Random;
import java.lang.Math;

public class PrimeNumber {
    private static String answer = "?";
    private static int n = 0;
    private static final int BOUND = 1000;
    private static final Random RAND_GENERATOR = new Random();

    private static boolean isPrime(int number) {
        int it = 2;
        while (it < Math.sqrt(number)) {
            if (number % it == 0) {
                return false;
            }
            it++;
        }
        return true;
    }

    private static void generateNewInput() {
        n = RAND_GENERATOR.nextInt(BOUND);

        if (isPrime(n)) {
            answer = "yes";
        } else {
            answer = "no";
        }
    }

    public static String getQuestion() {
        generateNewInput();
        return String.valueOf(n);
    }

    public static String getAnswer() {
        return answer;
    }
}
