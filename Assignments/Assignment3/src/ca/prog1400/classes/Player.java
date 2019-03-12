package ca.prog1400.classes;

public class Player extends Character {
    private static String playerName;
    private static Weapon weapon;

    public Player(String charName, int hitPoint, int defensePoint, int agilityPoint, int baseAttackPoint, String desc, String imageAddr, String playerName, Weapon weapon) {
        super(charName, hitPoint, defensePoint, agilityPoint, baseAttackPoint, desc, imageAddr);
        this.playerName = playerName;
        this.weapon = weapon;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Player.playerName = playerName;
    }

    public static Weapon getWeapon() {
        return weapon;
    }

    public static void setWeapon(Weapon weapon) {
        Player.weapon = weapon;
    }
}
