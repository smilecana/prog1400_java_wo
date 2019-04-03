package ca.prog1400.classes;

import java.util.ArrayList;

public abstract class Animal {
    private static ArrayList<GPS> gpsArrayList = new ArrayList<>();
    private String species;
    private String sex;
    private int weight;

    public Animal(String species, String sex, int weight, ArrayList<GPS> gpsArrayList) {
        this.species = species;
        this.sex = sex;
        this.weight = weight;
        this.gpsArrayList = gpsArrayList;
    }

    // make string about gps data for tostring()
    public void makeGpsString() {
    }

    public static ArrayList<GPS> getGpsArrayList() {
        return gpsArrayList;
    }

    public String getSpecies() {
        return species;
    }

    public String getSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }
}
