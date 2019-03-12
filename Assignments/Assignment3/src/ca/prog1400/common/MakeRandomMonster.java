package ca.prog1400.common;

import ca.prog1400.classes.Monster;
import ca.prog1400.classes.Gazer;
import ca.prog1400.classes.Orc;
import ca.prog1400.classes.Dragon;

public class MakeRandomMonster {
    private static Monster randomMonster;
    // make random selected monster using random number between 1 and 3
    public static void MakeRandomMonster(int ranNum) {
        switch (ranNum) {
            case 1:
                randomMonster = new Gazer("Gazer", 50, 40, 50, 30, "/images/Gazer.jpg");
                break;
            case 2:
                randomMonster = new Orc("Orc", 70, 50, 40, 60, "/images/Orc.jpg");
                break;
            case 3:
                randomMonster = new Dragon("Dragon", 100, 80, 60, 90, "/images/Dragon.jpg");
                break;
        }
    }

    public static Monster getRandomMonster() {
        return randomMonster;
    }
}
