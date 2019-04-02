package ca.prog1400.classes;

import ca.prog1400.common.LogToFile;

import java.util.ArrayList;

public class Sealion extends Animal implements ILoggable{
    private int numberOfSpots;
    private String sealionGpsString = "";

    // multi-parameters constructor
    public Sealion(String species, String sex, int weight, int numberOfSpots, ArrayList<GPS> gpsArrayList) {
        super(species, sex, weight, gpsArrayList);
        this.numberOfSpots = numberOfSpots;
        makeGpsString();
        gpsLogToFile();
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public void makeGpsString() {
        for(GPS i: getGpsArrayList()) {
            sealionGpsString += i.getLongitude() + " " + i.getLongitude() + "\n";
        }
    }

    @Override
    public void gpsLogToFile() {
        LogToFile.LogToFile(getGpsArrayList());
    }

    @Override
    public void gpsLogToConsole() {

    }

    @Override
    public String toString() {

        return String.format("Species: " + getSpecies() + "\n" + "Gender: " + getSex() + "\n"
                + "Weight: " + getWeight() + "Kg\n" + "The number of spots: " + getNumberOfSpots() + "\n" + "GPS Positions:\n"
                + sealionGpsString + "--------------------------------\n");
    }
}
