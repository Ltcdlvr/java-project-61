package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenNumber;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static String userName;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Integer GAME_ROUNDS = 3;

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

    public static void runEvenGame() {
        getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int counter = 0;

        while (counter < GAME_ROUNDS) {
            askQuestion(EvenNumber.getQuestion());
            String rightAnswer = EvenNumber.getAnswer();
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(rightAnswer)) {
                counter += 1;
                giveSuccessFeedback();
            } else {
                giveNegativeFeedback(rightAnswer, userAnswer);
                break;
            }
        }

        if (counter >= GAME_ROUNDS) {
            giveCongratulations();
        }
    }

    public static void runCalcGame() {
        getName();
        System.out.println(Calculator.getRules());

        int counter = 0;
        var rounds = Calculator.getRounds(GAME_ROUNDS);

        while (counter < GAME_ROUNDS) {
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

        if (counter >= GAME_ROUNDS) {
            giveCongratulations();
        }
    }

    public static void runGcdGame() {
        getName();
        System.out.println("Find the greatest common divisor of given numbers.");

        int counter = 0;

        while (counter < GAME_ROUNDS) {
            askQuestion(GCD.getQuestion());
            String rightAnswer = GCD.getAnswer();
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(rightAnswer)) {
                counter += 1;
                giveSuccessFeedback();
            } else {
                giveNegativeFeedback(rightAnswer, userAnswer);
                break;
            }
        }

        if (counter >= GAME_ROUNDS) {
            giveCongratulations();
        }
    }

    public static void runProgressionGame() {
        getName();
        System.out.println("What number is missing in the progression?");

        int counter = 0;

        while (counter < GAME_ROUNDS) {
            askQuestion(Progression.getQuestion());
            String rightAnswer = Progression.getAnswer();
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(rightAnswer)) {
                counter += 1;
                giveSuccessFeedback();
            } else {
                giveNegativeFeedback(rightAnswer, userAnswer);
                break;
            }
        }

        if (counter >= GAME_ROUNDS) {
            giveCongratulations();
        }
    }

    public static void runPrimeGame() {
        getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int counter = 0;

        while (counter < GAME_ROUNDS) {
            askQuestion(PrimeNumber.getQuestion());
            String rightAnswer = PrimeNumber.getAnswer();
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(rightAnswer)) {
                counter += 1;
                giveSuccessFeedback();
            } else {
                giveNegativeFeedback(rightAnswer, userAnswer);
                break;
            }
        }

        if (counter >= GAME_ROUNDS) {
            giveCongratulations();
        }
    }
}
