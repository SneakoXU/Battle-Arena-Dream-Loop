public class Enemy {

    private int hitPoints;

    public Enemy() {
        hitPoints = 10;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void loseHitPoints(){
        hitPoints = this.getHitPoints() -5;
    }
}
