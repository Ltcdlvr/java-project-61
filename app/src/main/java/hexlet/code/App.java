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
        Scanner scanner = new Scanner(System.in);
        try {
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
                    Engine.getName();
                    break;
                }
                case "Even" -> {
                    Engine.runGame(EvenNumber.getRules(), EvenNumber.getRounds());
                    break;
                }
                case "Calc" -> {
                    Engine.runGame(Calculator.getRules(), Calculator.getRounds());
                    break;
                }
                case "GCD" -> {
                    Engine.runGame(GCD.getRules(), GCD.getRounds());
                    break;
                }
                case "Progression" -> {
                    Engine.runGame(Progression.getRules(), Progression.getRounds());
                    break;
                }
                case "Prime" -> {
                    Engine.runGame(PrimeNumber.getRules(), PrimeNumber.getRounds());
                    break;
                }
                default -> {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Bad input.");
        } finally {
            scanner.close();
        }
    }
}
