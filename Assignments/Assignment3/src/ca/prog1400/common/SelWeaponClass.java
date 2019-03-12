package ca.prog1400.common;

import ca.prog1400.classes.Dagger;
import ca.prog1400.classes.Hammer;
import ca.prog1400.classes.Player;
import ca.prog1400.classes.Sword;
import ca.prog1400.ui.SelectPanel;

public class SelWeaponClass extends SelectPanel {
    // make weapon object using input string
    public static void SelWeaponClass(String inputClass) {

        switch (inputClass) {
            case "Dagger":
                Player.setWeapon(new Dagger("Dagger", 5, 10, "Proficiency with a dagger allows you to add your proficiency bonus to the attack roll for any attack you make with it.", "/images/Dagger.jpg"));
                break;
            case "Sword":
                Player.setWeapon(new Sword("Sword", 7, 15, "A sword is a good all-round weapon. It is not too heavy and inflicts a lot of damage.", "/images/Sword.jpg"));
                break;
            case "Hammer":
                Player.setWeapon(new Hammer("Hammer", 10, 20, "This one-handed hammer with an iron head is useful for pounding pitons into a wall.", "/images/Hammer.jpg"));
                break;
        }
    }
}
