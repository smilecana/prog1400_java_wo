package ca.prog1400.classes;

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
    }

    public String getDentalHealth() {
        return dentalHealth;
    }

    public void setDentalHealth(String dentalHealth) {
        this.dentalHealth = dentalHealth;
    }

    @Override
    public void makeGpsString() {
        for(GPS i: getGpsArrayList()) {
            walrusGpsString += i.getLongitude() + " " + i.getLongitude() + "\n";
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
                + "Weight: " + getWeight() + "Kg\n" + "Dental Health: " + getDentalHealth() + "\n" + "GPS Positions:\n"
                + walrusGpsString + "--------------------------------\n");
    }
}
