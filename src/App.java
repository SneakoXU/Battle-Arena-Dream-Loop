import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        greeting();

        User player1 = new User();

        player1.setName("Niko");
        player1.printName();


        int playerStamina = player1.getStamina();
        int playerPanic = player1.getPanicLevel();

        Enemy battleEnemy = new Enemy();
        int enemyHitPoints = battleEnemy.getHitPoints();
        




        Dice gameDice = new Dice();
        System.out.println(gameDice.getDiceRoll());
    }


    public static void greeting(){
        System.out.println("YOU ARE ABOUT TO ENTER THE BATTLE ARENA DREAM LOOP.");
        System.out.println("-------------------------------------------------------");
    }


}
