package ca.prog1400;

/**
 * Class for Animal in the zoo.
 */
public class Animal {
    private String species; // required
    private double maxWeight; // not required, default 0
    private String habitat; // required
    private boolean isEndangered; // not required, default false

    // Default Constructor: Supplying empty values.
    public Animal() {
        this.species = null;
        this.maxWeight = 0;
        this.habitat = null;
        this.isEndangered = false;
    }

    // Standard Constructor: parameters for each attribute
    public Animal(String species, double maxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // Feed this animal
    public String feed(String food) {
        maxWeight += food.length();
        return String.format("NOM NOM NOM. I ate the %s", food);
    }

    // Make a sound
    public String makeASound() {
        return String.format("I am a %s and I made a sound", this.species);
    }

    // To String
    public String toString() {
        String returnValue = String.format("I am a %s that live in the %s.", this.species, this.habitat);
        if (this.isEndangered) {
            returnValue += " I am endangered.";
        } else {
            returnValue += " I am not endangered.";
        }
        return returnValue;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species != null && !species.equals("")) {
            this.species = species;
        }
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    // Max Weight is read-only. Calculated internally.
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.equals("")) {
            this.habitat = habitat;
        }
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
}
