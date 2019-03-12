package ca.prog1400.classes;

public class Warrior extends Player{
    public Warrior(String charName, int hitPoint, int defensePoint, int agilityPoint, int baseAttackPoint, String desc, String imageAddr, String playerName, Weapon weapon) {
        super(charName, hitPoint, defensePoint, agilityPoint, baseAttackPoint, desc, imageAddr, playerName, weapon);
    }

    @Override
    public String toString() {
        return String.format("%s\n--------------------\n%s\n%-15s%-15s%-15s%s\n%-30s%-15s%s\n\n", "Player: " + getPlayerName(), "Class: " + getCharName(),"HP: " + getHitPoint(), "Defense: " + getDefensePoint(), "Agility: " + getAgilityPoint(), "Base Attack: " + getBaseAttackPoint(), "Weapon: " + getWeapon().getWeaponName(), "Weight: " + getWeapon().getWeight(), "Attack Mode: " + getWeapon().getAttackModifier());
    }
}
