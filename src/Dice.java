import java.util.Random;

public class Dice {

    private int diceRoll;

    public Dice(){

    }

    public int getDiceRoll() {
        diceRoll = new Random().nextInt(7);
        boolean zero = true;
        if(diceRoll == 0){
            while(zero){
                diceRoll = new Random().nextInt(7);
                if(diceRoll != 0){
                    zero = false;
                }
            }

        }
        return diceRoll;
    }


}
