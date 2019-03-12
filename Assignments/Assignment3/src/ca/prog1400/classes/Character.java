package ca.prog1400.classes;

public abstract class Character {
    private String charName;
    private int hitPoint;
    private int defensePoint;
    private int agilityPoint;
    private int baseAttackPoint;
    private String desc;
    private String imageAddr;

    public Character(String charName, int hitPoint, int defensePoint, int agilityPoint, int baseAttackPoint, String desc, String imageAddr) {
        this.charName = charName;
        this.hitPoint = hitPoint;
        this.defensePoint = defensePoint;
        this.agilityPoint = agilityPoint;
        this.baseAttackPoint = baseAttackPoint;
        this.desc = desc;
        this.imageAddr = imageAddr;
    }

    public Character(String charName, int hitPoint, int defensePoint, int agilityPoint, int baseAttackPoint, String imageAddr) {
        this.charName = charName;
        this.hitPoint = hitPoint;
        this.defensePoint = defensePoint;
        this.agilityPoint = agilityPoint;
        this.baseAttackPoint = baseAttackPoint;
        this.imageAddr = imageAddr;
    }

    public String getCharName() {
        return charName;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

    public int getAgilityPoint() {
        return agilityPoint;
    }

    public void setAgilityPoint(int agilityPoint) {
        this.agilityPoint = agilityPoint;
    }

    public int getBaseAttackPoint() {
        return baseAttackPoint;
    }

    public void setBaseAttackPoint(int baseAttackPoint) {
        this.baseAttackPoint = baseAttackPoint;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageAddr() {
        return imageAddr;
    }
}
