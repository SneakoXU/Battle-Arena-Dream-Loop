public class User {

    private int stamina;
    private int panicLevel;
    private String name;

    public User(String name) {
        stamina = 10;
        panicLevel = 10;
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

//    public void setStamina(int stamina) {
//        this.stamina = stamina;
//    }

    public int getPanicLevel() {
        return panicLevel;
    }

//    public void setPanicLevel(int panicLevel) {
//        this.panicLevel = panicLevel;
//    }

    public String getName() {
        return name;
    }

    public void staminaUp(){
        stamina = this.getStamina() + 1;
    }

    public void staminaDown(){
        stamina = this.getStamina() - 1;
    }


}
