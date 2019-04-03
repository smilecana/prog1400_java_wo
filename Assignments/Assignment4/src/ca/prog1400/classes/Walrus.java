package ca.prog1400.classes;

import ca.prog1400.common.LogToConsole;
import ca.prog1400.common.LogToFile;

import java.util.ArrayList;

public class Walrus extends Animal implements ILoggable{
    private String dentalHealth;
    private String walrusGpsString = "";

    // multi-parameters constructor
    public Walrus(String species, String sex, int weight, String dentalHealth, ArrayList<GPS> gpsArrayList) {
        super(species, sex, weight, gpsArrayList);
        this.dentalHealth = dentalHealth;
        makeGpsString();
        gpsLogToFile();
        gpsLogToConsole();
    }

    public String getDentalHealth() {
        return dentalHealth;
    }

    // make string about gps data for toString()
    @Override
    public void makeGpsString() {
        for(GPS i: getGpsArrayList()) {
            walrusGpsString += i.getLongitude() + " " + i.getLongitude() + "\n";
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
                + "Weight: " + getWeight() + "Kg\n" + "Dental Health: " + getDentalHealth() + "\n" + "GPS Positions:\n"
                + walrusGpsString + "--------------------------------\n");
    }
}
