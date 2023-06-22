package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final Integer GAME_ROUNDS = 3;

    public static void runGame(String rules, String[][] rounds) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            System.out.println(rules);

            for (int counter = 0; counter < GAME_ROUNDS; counter++) {
                var curRound = rounds[counter];
                System.out.println("Question: " + curRound[0]);
                String rightAnswer = curRound[1];
                String userAnswer = scanner.next();

                if (userAnswer.equals(rightAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                            + rightAnswer + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
