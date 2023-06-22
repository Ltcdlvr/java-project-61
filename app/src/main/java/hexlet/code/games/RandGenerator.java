package hexlet.code.games;

import java.util.Random;

public class RandGenerator {

    private static final Random RAND_GENERATOR = new Random();

    public static int getRandomInt(int max) {
        return RAND_GENERATOR.nextInt(max);
    }
}
