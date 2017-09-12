import java.util.HashMap;

/**
 * Created by Kathan Master on 2/12/2017.
 */
public class Rock implements Weapon {
    public String printName() {
        return "Rock";
    }

    public void attack(Tower t){
        HashMap<Fortification, Integer> towerForts = t.getFortifications();
        if (towerForts.get(new RubberWall()) > 0) {
            
        }
    }
}
