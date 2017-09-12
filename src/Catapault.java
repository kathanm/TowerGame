import java.util.HashMap;

/**
 * Created by Kathan Master on 2/12/2017.
 */
public class Catapault implements Weapon {
    public String printName() {
        return "Catapult";
    }

    @Override
    public String printNameWithoutString() {
        return "Catapult";
    }

    @Override
    public void attack(Tower t) {
        int damage = 20;
        HashMap<String, Integer> forts = t.getFortifications();
        if (forts.get("StrongerWalls") > 0) {
            damage = 10;
        }
        if (t.getBarrierHealth() > 0) {
            t.takeBarrierDamage(damage);
        }
        else {
            t.takeDamage(damage);
        }
    }
}
