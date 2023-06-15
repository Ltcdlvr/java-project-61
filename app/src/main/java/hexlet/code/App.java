package hexlet.code;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        try {
            InputSource source = InputSource.getInstance();
            Map<Integer, String> gameList = new HashMap<Integer, String>();
            gameList.put(1, "Greet");
            gameList.put(2, "Even");
            gameList.put(3, "Calc");
            gameList.put(4, "GCD");
            gameList.put(5, "Progression");
            gameList.put(6, "Prime");
            gameList.put(0 ,"Exit");

            System.out.println("Please enter the game number and press Enter.");
            for (var game : gameList.entrySet()) {
                System.out.println(game.getKey() + " - " + game.getValue());
            }

            int gameNumber = source.getIntAnswer();
            System.out.println("Your choice " + gameNumber);
            if (gameNumber > gameList.size() || gameNumber < 0) {
                System.out.println("Bad input.");
            }

            String curGame = gameList.get(gameNumber);
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
        } catch (Exception e){
            System.out.println("Bad input.");
        } finally {
            InputSource.close();
        }
    }
}
