import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean run = true;
        Scanner userInput = new Scanner(System.in);
        greeting();
        String inputName = userInput.nextLine();


        User player1 = new User();
        Enemy battleEnemy = new Enemy();
        Dice gameDice = new Dice();
        int enemyHitPoints = battleEnemy.getHitPoints();

        player1.setName(inputName);
        System.out.println("Welcome to the Battle Arena Dream Loop, " + inputName + ". " + "Hope you are ready to fight for your survival.");
        System.out.println(">>> Enter 1 to continue and view your survival stats...");

        if(userInput.nextLine().equals("1")) {
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("\n" +
                    "__   __                 _____                  _            _   _____ _        _       \n" +
                    "\\ \\ / /                /  ___|                (_)          | | /  ___| |      | |      \n" +
                    " \\ V /___  _   _ _ __  \\ `--. _   _ _ ____   _____   ____ _| | \\ `--.| |_ __ _| |_ ___ \n" +
                    "  \\ // _ \\| | | | '__|  `--. \\ | | | '__\\ \\ / / \\ \\ / / _` | |  `--. \\ __/ _` | __/ __|\n" +
                    "  | | (_) | |_| | |    /\\__/ / |_| | |   \\ V /| |\\ V / (_| | | /\\__/ / || (_| | |_\\__ \\\n" +
                    "  \\_/\\___/ \\__,_|_|    \\____/ \\__,_|_|    \\_/ |_| \\_/ \\__,_|_| \\____/ \\__\\__,_|\\__|___/\n" +
                    "                                                                                       \n" +
                    "                                                                                       \n");
            displayStats(player1);
            System.out.println("--------------------------");
            System.out.println("--------------------------\n\n");
            System.out.println(">>> Enter (E) to view your enemy...");
        }
        if(userInput.nextLine().equalsIgnoreCase("e")){
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("\n" +
                        " _______  _        _______  _______             _______ _________ _______ _________ _______ \n" +
                        "(  ____ \\( (    /|(  ____ \\(       )|\\     /|  (  ____ \\\\__   __/(  ___  )\\__   __/(  ____ \\\n" +
                        "| (    \\/|  \\  ( || (    \\/| () () |( \\   / )  | (    \\/   ) (   | (   ) |   ) (   | (    \\/\n" +
                        "| (__    |   \\ | || (__    | || || | \\ (_) /   | (_____    | |   | (___) |   | |   | (_____ \n" +
                        "|  __)   | (\\ \\) ||  __)   | |(_)| |  \\   /    (_____  )   | |   |  ___  |   | |   (_____  )\n" +
                        "| (      | | \\   || (      | |   | |   ) (           ) |   | |   | (   ) |   | |         ) |\n" +
                        "| (____/\\| )  \\  || (____/\\| )   ( |   | |     /\\____) |   | |   | )   ( |   | |   /\\____) |\n" +
                        "(_______/|/    )_)(_______/|/     \\|   \\_/     \\_______)   )_(   |/     \\|   )_(   \\_______)\n" +
                        "                                                                                            \n");
            displayEnemyStats(battleEnemy);
            System.out.println("--------------------------");
            System.out.println("--------------------------\n\n");
            System.out.println(">>> Enter (D) to view the dice roll effects/details...");
        }
        if(userInput.nextLine().equalsIgnoreCase("d")){
            diceDetails();
            System.out.println(">>> (R)oll the dice to begin the battle, " + player1.getName() + ".");
        }

        while(run){
            String scriptInput = userInput.nextLine();
            if(scriptInput.equalsIgnoreCase("r")) {
                int diceResult = gameDice.getDiceRoll();
                System.out.println(diceResult);
                diceEffect(diceResult, player1, battleEnemy);
                if(battleEnemy.getHitPoints()>0){
                    player1.setStamina(player1.getStamina() -1);
                    player1.setPanicLevel(player1.getPanicLevel() + 1);
                }
                System.out.println(">>> Enter (R) to roll again or (S) to view your stats, (E) for the enemy's stats...");
                        //scriptInput = userInput.nextLine();
            }
            if(scriptInput.equalsIgnoreCase("s")) {
                displayStats(player1);
                System.out.println(">>> Enter (R) to roll again or (S) to view your stats, (E) for the enemy's stats...");
            }
            if(scriptInput.equalsIgnoreCase("e")){
                displayEnemyStats(battleEnemy);
                System.out.println(">>> Enter (R) to roll again or (S) to view your stats, (E) for the enemy's stats...");
                        //scriptInput = userInput.nextLine();
            }if(battleEnemy.getHitPoints() <= 0){
                System.out.println("YOU DEFEATED THE DEMOGORGON!");
                System.exit(0);
            }
            if(player1.getPanicLevel() >= 20){
                System.out.println("You are panicking too much and have submitted to the Demogorgon. You are now a prisoner of the Dream Loop Battle Arena forever.");
                System.exit(0);
            }if(player1.getStamina() <= 0){
                System.out.println("The Demogorgon has won.");
                System.exit(0);
            }


            }



        }




    public static void greeting(){
        System.out.println("\n" +
                "  ___       _   _   _         _                       ___                       _                  \n" +
                " | _ ) __ _| |_| |_| |___    /_\\  _ _ ___ _ _  __ _  |   \\ _ _ ___ __ _ _ __   | |   ___  ___ _ __ \n" +
                " | _ \\/ _` |  _|  _| / -_)  / _ \\| '_/ -_) ' \\/ _` | | |) | '_/ -_) _` | '  \\  | |__/ _ \\/ _ \\ '_ \\\n" +
                " |___/\\__,_|\\__|\\__|_\\___| /_/ \\_\\_| \\___|_||_\\__,_| |___/|_| \\___\\__,_|_|_|_| |____\\___/\\___/ .__/\n" +
                "                                                                                             |_|   \n");
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter your name: ");
    }

    public static void displayStats(User player){
//        int playerStamina = player.getStamina();
//        int playerPanic = player.getPanicLevel();
        System.out.println("Stamina: " + player.getStamina());
        System.out.println("Panic Level: " + player.getPanicLevel());
    }

    public static void displayEnemyStats(Enemy enemy){
        int hitPoints = enemy.getHitPoints();
        System.out.println("Name: The Demogorgon");
        System.out.println("Type: Demon");
        System.out.println("Hit Points: " + hitPoints);

    }

    public static void diceDetails(){
        System.out.println("\n" +
                " ________   __     ______    _______       _______     ______    ___      ___           ________    _______  ___________   __        __    ___        ________  \n" +
                "|\"      \"\\ |\" \\   /\" _  \"\\  /\"     \"|     /\"      \\   /    \" \\  |\"  |    |\"  |         |\"      \"\\  /\"     \"|(\"     _   \") /\"\"\\      |\" \\  |\"  |      /\"       ) \n" +
                "(.  ___  :)||  | (: ( \\___)(: ______)    |:        | // ____  \\ ||  |    ||  |         (.  ___  :)(: ______) )__/  \\\\__/ /    \\     ||  | ||  |     (:   \\___/  \n" +
                "|: \\   ) |||:  |  \\/ \\      \\/    |      |_____/   )/  /    ) :)|:  |    |:  |         |: \\   ) || \\/    |      \\\\_ /   /' /\\  \\    |:  | |:  |      \\___  \\    \n" +
                "(| (___\\ |||.  |  //  \\ _   // ___)_      //      /(: (____/ //  \\  |___  \\  |___      (| (___\\ || // ___)_     |.  |  //  __'  \\   |.  |  \\  |___    __/  \\\\   \n" +
                "|:       :)/\\  |\\(:   _) \\ (:      \"|    |:  __   \\ \\        /  ( \\_|:  \\( \\_|:  \\     |:       :)(:      \"|    \\:  | /   /  \\\\  \\  /\\  |\\( \\_|:  \\  /\" \\   :)  \n" +
                "(________/(__\\_|_)\\_______) \\_______)    |__|  \\___) \\\"_____/    \\_______)\\_______)    (________/  \\_______)     \\__|(___/    \\___)(__\\_|_)\\_______)(_______/   \n" +
                "                                                                                                                                                                \n");
        System.out.println("The following list details the effect of each roll:\n");
        System.out.println("1 - You get hit. Your panic level increases by 2.");
        System.out.println("2 - You dodged the attack, but stamina is reduced by 1.");
        System.out.println("3 - You deflect the attack. No stat change.");
        System.out.println("4 - The enemy backs away; your stamina increases by 1.");
        System.out.println("5 - The enemy dodges but you still strike a glancing blow. Your panic is reduced by 1. The enemy loses 3 hit points.");
        System.out.println("6 - The enemy takes significant damage. Your panic is reduced by 3 and stamina increased by 2. The enemy loses 5 hit points.");




    }

    public static void diceEffect(int diceNum, User user, Enemy enemy){
        if(diceNum == 1){
            System.out.println("You've been hit. -- (Panic Level +2)");
            user.setPanicLevel(user.getPanicLevel() + 2);
        }else if(diceNum == 2){
            System.out.println("The enemy attacks but you swiftly dodge it. -- (Stamina -1)");
            user.setStamina(user.getStamina() -1);
        }else if(diceNum == 3){
            System.out.println("You deflect their attack! No stat change!");
        }else if(diceNum == 4){
            System.out.println("The enemy backs away like a chump. -- (Stamina +1)");
            user.setStamina(user.getStamina() + 1);
        }else if(diceNum == 5){
            System.out.println("You attack, the enemy dodges but you still strike a glancing blow. -- (Panic Level -1, Enemy Hit Pts -3)");
            user.setPanicLevel(user.getPanicLevel() -1);
            enemy.setHitPoints(enemy.getHitPoints() -3);
        }else if(diceNum == 6){
            System.out.println("You use your super attack and significantly damage the enemy! -- (Panic Level -3, Stamina +2, Enemy Hit Pts -5)");
            user.setPanicLevel(user.getPanicLevel() -3);
            user.setStamina(user.getStamina() + 2);
            enemy.setHitPoints(enemy.getHitPoints() -5);
        }
    }


}
