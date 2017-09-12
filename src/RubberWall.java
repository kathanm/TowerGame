/**
 * Created by Kathan Master on 2/12/2017.
 */
public class RubberWall implements Fortification {
    private int turnsLeft;

    public RubberWall() {
        this.turnsLeft = 5;
    }

    public void update() {
        this.turnsLeft -= 1;
    }

    public int getTurnsLeft() {
        return this.turnsLeft;
    }

    public String printName() {
        return "Rubber Wall";
    }
}
