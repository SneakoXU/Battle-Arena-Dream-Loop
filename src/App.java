public class App {

    public static void main(String[] args) {
        User player1 = new User("Niko Suntay");

        int playerStamina = player1.getStamina();
        int playerPanic = player1.getPanicLevel();

        Enemy battleEnemy = new Enemy();
        int enemyHitPoints = battleEnemy.getHitPoints();
        




        Dice gameDice = new Dice();
        System.out.println(gameDice.getDiceRoll());
    }


}
