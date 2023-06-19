package hexlet.code;

import java.util.List;
import java.util.Scanner;

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
                    Engine.runEvenGame();
                    break;
                }
                case "Calc" -> {
                    Engine.runCalcGame();
                    break;
                }
                case "GCD" -> {
                    Engine.runGcdGame();
                    break;
                }
                case "Progression" -> {
                    Engine.runProgressionGame();
                    break;
                }
                case "Prime" -> {
                    Engine.runPrimeGame();
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
