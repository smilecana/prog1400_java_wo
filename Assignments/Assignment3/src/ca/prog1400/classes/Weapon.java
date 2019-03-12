package ca.prog1400.classes;

public abstract class Weapon {
    private String weaponName;
    private int attackModifier;
    private int weight;
    private String desc;
    private String imageAddr;

    public Weapon(String weaponName, int attackModifier, int weight, String desc, String imageAddr) {
        this.weaponName = weaponName;
        this. attackModifier = attackModifier;
        this. weight = weight;
        this.desc = desc;
        this.imageAddr = imageAddr;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageAddr() {
        return imageAddr;
    }

    public void setImageAddr(String imageAddr) {
        this.imageAddr = imageAddr;
    }
}
