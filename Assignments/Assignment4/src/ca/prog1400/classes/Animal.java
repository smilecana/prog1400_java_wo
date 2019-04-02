package ca.prog1400.classes;

import java.util.ArrayList;

public abstract class Animal {
    private static ArrayList<GPS> gpsArrayList = new ArrayList<>();
    //private GPS gps = new GPS();
    private String species;
    private String sex;
    private int weight;

    public Animal(String species, String sex, int weight, ArrayList<GPS> gpsArrayList) {
        this.species = species;
        this.sex = sex;
        this.weight = weight;
        this.gpsArrayList = gpsArrayList;
    }

    public void makeGpsString() {
    }

    public static ArrayList<GPS> getGpsArrayList() {
        return gpsArrayList;
    }

    public static void setGpsArrayList(ArrayList<GPS> gpsArrayList) {
        Animal.gpsArrayList = gpsArrayList;
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
