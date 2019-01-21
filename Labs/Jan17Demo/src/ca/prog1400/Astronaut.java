package ca.prog1400;

// Class declaration
public class Astronaut { // "cell membrane of the class"
    // Any variables or properties
    String name;
    int weight;
    double remaining02;
    // Constuctors
    public Astronaut (String name, int weight, double oxygen) {
        this.name = name;
        this.weight = weight;
        this.remaining02 = oxygen;
    }
    // Functions
    public double groundControlToMajorTom() {
        // what is your 02 level
        return this.remaining02;
    }

}
