import java.util.Random;

public class Dice {

    private int diceRoll;

    public Dice(){

    }

    public int getDiceRoll() {
        diceRoll = new Random().nextInt(7);
        if(diceRoll == 0){
            diceRoll = new Random().nextInt(7);
        }
        return diceRoll;
    }


}
