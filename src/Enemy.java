public class Enemy {

    private int hitPoints;
    private String name;
    private String type;

    public Enemy(String name, String type) {
        this.name = name;
        this.type = type;
        hitPoints = 10;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void loseHitPoints(){
        hitPoints = this.getHitPoints() -5;
    }
}
