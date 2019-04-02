package ca.prog1400.common;

import ca.prog1400.classes.GPS;
import ca.prog1400.ui.MainPanel;

import java.util.ArrayList;

public class LogToConsole {
    private static String gpsString = "";

    public static void LogToConsole(ArrayList<GPS> arrayList){
        for(GPS i: arrayList) {
            gpsString += i.getLatitude() + " " + i.getLongitude() + "\n";
        }
        System.out.println("GPS data of " + MainPanel.getAnimalDropBox().getSelectedItem() + "\n" + gpsString + "Will be saved in the log file.\n");
        gpsString = "";
    }
}
