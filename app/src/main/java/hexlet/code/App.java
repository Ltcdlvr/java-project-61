package hexlet.code;


public class App {
    public static void main(String[] args) {

        InputSource source = InputSource.getInstance();

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = source.getIntAnswer();

        System.out.println("Your choice " + gameNumber);

        switch (gameNumber) {
            case 1 -> {
                Engine.getName();
                break;
            }
            case 2 -> {
                Engine.evenGame();
                break;
            }
            case 3 -> {
                Engine.calcGame();
                break;
            }
            case 4 -> {
                Engine.gcdGame();
                break;
            }
            case 5 -> {
                Engine.progressionGame();
                break;
            }
        }
    }
}
