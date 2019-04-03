package ca.prog1400.common;

import ca.prog1400.classes.*;
import ca.prog1400.ui.MainPanel;

public class SelAnimal {
    private static Animal selAnimal;

    public static void SelAnimal(String string) {
        // example of polymorphism
        switch (string) {
            case "Penguin":
                selAnimal = new Penguin(MainPanel.getSelSpecies(), MainPanel.getSelSex(), MainPanel.getSelWeight(), MainPanel.getSelBloodPressure(), MainPanel.getGpsArrayList());
                break;
            case "Sea Lion":
                selAnimal = new Sealion(MainPanel.getSelSpecies(), MainPanel.getSelSex(), MainPanel.getSelWeight(), MainPanel.getSelNumSpots(), MainPanel.getGpsArrayList());
                break;
            case "Walrus":
                selAnimal = new Walrus(MainPanel.getSelSpecies(), MainPanel.getSelSex(), MainPanel.getSelWeight(), MainPanel.getSelDentalHealth(), MainPanel.getGpsArrayList());
                break;
        }
        // reset gpsArrayList
        MainPanel.getGpsArrayList().clear();
    }

    public static Animal getSelAnimal() {
        return selAnimal;
    }
}
