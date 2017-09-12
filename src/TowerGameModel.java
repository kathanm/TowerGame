import java.util.HashMap;

/**
 * Created by Kathan Master on 2/12/2017.
 */
public class TowerGameModel {
    private Player player1;
    private Player player2;
    private int turn;
    private boolean isGameOver;

    /**
     * The model for the tower game.
     *
     * @param name1 The name of player 1.
     * @param name2 The name of player 2.
     */
    public TowerGameModel(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
        this.turn = 0;
        this.isGameOver = false;
    }

    public static Weapon scoutWeapon() {
        int roll = (int)(Math.random() * 7);

        if (roll == 0) {
            return new Catapault();
        }
        else if (roll <= 2) {
            return new Incendiary();
        }
        else {
            return new Rock();
        }
    }

    public static Fortification scoutFortification() {
        int roll = (int)(Math.random() * 6);

        if (roll == 0) {
            return new Barrier();
        }
        else if (roll == 1) {
            return new RubberWall();
        }
        else if (roll <= 3) {
            return new FireSprinkler();
        }
        else {
            return new StrongerWalls();
        }
    }

    public static String scout(Player p) {
        int  roll = (int)(Math.random() * 10);

        if (roll <= 2) {
            Fortification f = TowerGameModel.scoutFortification();
            return f.printName();
        }

        else {
            Weapon w = TowerGameModel.scoutWeapon();
            return w.printName();
        }
    }

    public static HashMap<String, Integer> initFortifications() {
        HashMap<String, Integer> initFortifications = new HashMap<String, Integer>();
        initFortifications.put("RubberWall", 0);
        initFortifications.put("FireSprinkler", 0);
        initFortifications.put("StrongerWalls", 0);

        return initFortifications;
    }

    public static HashMap<String, Integer> initWeapons() {
        HashMap<String, Integer> initWeapons = new HashMap<String, Integer>();
        initWeapons.put("Rock", 3);
        initWeapons.put("Incendiary", 0);
        initWeapons.put("Catapult", 0);

        return initWeapons;
    }
}
