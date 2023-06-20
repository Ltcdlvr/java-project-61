package hexlet.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engine {

    private static String userName;
    private static final Scanner SCANNER = new Scanner(System.in);

    private static void askQuestion(String gameQuestion) {
        System.out.println("Question: " + gameQuestion);
    }

    private static void giveSuccessFeedback() {
        System.out.println("Correct!");
    }

    private static void giveNegativeFeedback(String rightAnswer, String userAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }

    private static void giveCongratulations() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void runGame(String rules, ArrayList<List<String>> rounds) {
        getName();
        System.out.println(rules);
        int counter = 0;

        while (counter < rounds.size()) {
            var curRound = rounds.get(counter);
            askQuestion(curRound.get(0));
            String rightAnswer = curRound.get(1);
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(rightAnswer)) {
                counter += 1;
                giveSuccessFeedback();
            } else {
                giveNegativeFeedback(rightAnswer, userAnswer);
                break;
            }
        }

        if (counter >= rounds.size()) {
            giveCongratulations();
        }

        SCANNER.close();
    }
}
