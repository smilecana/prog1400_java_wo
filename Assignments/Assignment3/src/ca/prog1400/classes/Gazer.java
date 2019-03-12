package ca.prog1400.classes;

public class Gazer extends Monster {

    public Gazer(String charName, int hitPoint, int defensePoint, int agilityPoint, int baseAttackPoint, String imageAddr) {
        super(charName, hitPoint, defensePoint, agilityPoint, baseAttackPoint,imageAddr);
    }

    @Override
    public String toString() {
        return String.format("%s\n--------------------\n%-15s%-15s%-15s%s", "Monster: " + getCharName(), "HP: " + getHitPoint(), "Defence: " + getDefensePoint(), "Agility: " + getAgilityPoint(), "Base Attack: " + getBaseAttackPoint());
    }
}
