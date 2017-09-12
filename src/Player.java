import java.util.HashMap;

/**
 * Created by Kathan Master on 2/12/2017.
 */
public class Player {
    private final String name;
    private final Tower tower;
    private HashMap<String, Integer> weapons;
    private HashMap<String, Integer> fortifications;
    private int gold;

    Player(String name) {
        this.name = name;
        this.tower = new Tower();
        this.weapons = TowerGameModel.initWeapons();
        this.fortifications = TowerGameModel.initFortifications();
        this.gold = 100;
    }

    int getGold() {
        return this.gold;
    }

    String getName() {
        return this.name;
    }

    public void addWeapon(Weapon w) {
        weapons.put(w.printNameWithoutString(), weapons.get(w.printNameWithoutString()) + 1);
    }
}
