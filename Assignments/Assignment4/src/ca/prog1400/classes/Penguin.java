package ca.prog1400.classes;

import ca.prog1400.common.LogToConsole;
import ca.prog1400.common.LogToFile;

import java.util.ArrayList;

public class Penguin extends Animal implements ILoggable{
    private double bloodPressure;
    private String penguinGpsString = "";

    // multi-parameters constructor
    public Penguin(String species, String sex, int weight, double bloodPressure, ArrayList<GPS> gpsArrayList) {
        super(species, sex, weight, gpsArrayList);
        this.bloodPressure = bloodPressure;
        makeGpsString();
        gpsLogToFile();
        gpsLogToConsole();
    }

    // make string about gps data for toString()
    @Override
    public void makeGpsString() {
        for(GPS i: getGpsArrayList()) {
            penguinGpsString += i.getLongitude() + " " + i.getLongitude() + "\n";
        }
    }

    // save gps data to log file
    @Override
    public void gpsLogToFile() {
        LogToFile.LogToFile(getGpsArrayList());
    }

    // output gps data to console for debugging
    @Override
    public void gpsLogToConsole() {
        LogToConsole.LogToConsole(getGpsArrayList());
    }

    @Override
    public String toString() {

        return String.format("Species: " + getSpecies() + "\n" + "Gender: " + getSex() + "\n"
                + "Weight: " + getWeight() + "Kg\n" + "Blood Pressure: " + getBloodPressure() + "\n" + "GPS Positions:\n"
                + penguinGpsString + "--------------------------------\n");
    }

    public double getBloodPressure() {
        return bloodPressure;
    }
}

