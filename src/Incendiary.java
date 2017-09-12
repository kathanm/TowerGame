/**
 * Created by Kathan Master on 2/12/2017.
 */
public class Incendiary implements Weapon {
    @Override
    public String printName() {
        return "Incendiary";
    }

    @Override
    public String printNameWithoutString() {
        return "Incendiary";
    }

    @Override
    public void attack(Tower t) {
        int damage = 5;
    }
}
