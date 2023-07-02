package hexlet.code;

import java.util.List;
import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenNumber;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            List<String> gameList = List.of("Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime");

            System.out.println("Please enter the game number and press Enter.");
            for (int index = 0; index < gameList.size(); index++) {
                System.out.println(index + " - " + gameList.get(index));
            }

            int gameNumber = Integer.parseInt(scanner.next());
            String curGame = null;

            System.out.println("Your choice " + gameNumber);
            if (gameNumber > gameList.size() || gameNumber < 0) {
                System.out.println("Bad input.");
            } else {
                curGame = gameList.get(gameNumber);
            }

            if (curGame == null) {
                curGame = "empty";
            }

            switch (curGame) {
                case "Greet" -> {
                    System.out.println("Welcome to the Brain Games!");
                    System.out.print("May I have your name? ");
                    System.out.println("Hello, " + scanner.next() + "!");
                }
                case "Even" -> {
                    EvenNumber.runGame();
                }
                case "Calc" -> {
                    Calculator.runGame();
                }
                case "GCD" -> {
                    GCD.runGame();
                }
                case "Progression" -> {
                    Progression.runGame();
                }
                case "Prime" -> {
                    PrimeNumber.runGame();
                }
                default -> {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Bad input.");
        }
    }
}
