import java.rmi.UnexpectedException;
import java.util.HashMap;

/**
 * Created by Kathan Master on 6/14/2017.
 */
public class RemoveFireSprinkler implements Weapon {
    @Override
    public String printName() {
        return "Remove Fire Sprinkler";
    }

    @Override
    public String printNameWithoutString() {
        return "RemoveFireSprinkler";
    }

    @Override
    public void attack(Tower t) {
        HashMap<String, Integer> TowerForts = t.getFortifications();
        if (TowerForts.get("FireSprinkler") < 1) {
            throw new UnsupportedOperationException("Cannot remove sprinkler. There are already 0.");
        }
        TowerForts.put("FireSprinkler", TowerForts.get("FireSprinkler")-1);
    }
}
