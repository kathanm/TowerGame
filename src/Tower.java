import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kathan Master on 2/12/2017.
 */

public class Tower {
    private int percentHealth;
    private HashMap<String, Integer> fortifications;
    private ArrayList<ArrayList<Weapon>> incomingQueue;
    private int barrierHealth;


    // Not sure if this is even needed.
    /*
    Tower(int percentHealth, HashMap<Fortification, Integer> fortifications, ArrayList<ArrayList<Weapon>> incomingQueue) {
        this.percentHealth = percentHealth;
        this.fortifications = fortifications;
        this.incomingQueue = incomingQueue;
    } */

    public Tower() {
        this.percentHealth = 100;
        this.fortifications = TowerGameModel.initFortifications();
        this.incomingQueue = new ArrayList<>();
        this.barrierHealth = 0;
    }

    public int getPercentHealth() {
        return this.percentHealth;
    }

    public int getBarrierHealth() {return this.barrierHealth;}

    public void takeBarrierDamage(int damageAmount) {
        if (this.barrierHealth <= 0) {
            throw new UnsupportedOperationException("Cannot attack barrier that doesn't exist or barrier has negative health");
        }

        else if (damageAmount > this.barrierHealth) {
            this.barrierHealth = 0;
        }

        else {
            this.barrierHealth -= damageAmount;
        }
    }

    public void takeDamage(int damageAmount) {
        percentHealth -= damageAmount;
    }

    public void processQueue(int turn) {
        if (incomingQueue.get(turn - 1) == null) {
            return;
        }
        else {
            for (Weapon w : incomingQueue.get(turn - 1)) {
                w.attack(this);
            }
        }
    }

    public HashMap<String, Integer> getFortifications() {
        return this.fortifications;
    }
}
