package ca.prog1400.common;

import ca.prog1400.classes.Cleric;
import ca.prog1400.classes.Player;
import ca.prog1400.classes.Warrior;
import ca.prog1400.classes.Wizard;
import ca.prog1400.ui.SelectPanel;

public class SelPlayerClass extends SelectPanel{

    private static Player selCharacter;
    // make player object using input string
    public static void SelPlayerClass(String inputString) {
        switch (inputString) {
            case "Warrior":
                selCharacter = new Warrior("Warrior", 100, 60, 40, 20, "You were a professional soldier. You traveled to foreign lands, led troops into danger, fought wars under the banners of different commanders.", "/images/Warrior.jpg", "", Player.getWeapon());
                break;
            case "Wizard":
                selCharacter = new Wizard("Wizard", 40, 60, 100, 20, "You were raised wanting for nothing, giving you a clarity of purpose that outweighs pedestrian survival. You know that your potential is limitless, and you aim to make use of your gods given talents.", "/images/Wizard.jpg", "", Player.getWeapon());
                break;
            case "Cleric":
                selCharacter = new Cleric("Cleric", 60, 100, 40, 20, "Before you became devoted to the dwarven deities, you were a journeyman jeweler and gem cutter. Even outside your home, you are recognized by your badge and skill.", "/images/Cleric.jpg", "", Player.getWeapon());
                break;
        }
    }

    public static Player getSelCharacter() {
        return selCharacter;
    }
}