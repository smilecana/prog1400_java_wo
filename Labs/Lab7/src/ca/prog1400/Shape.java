package ca.prog1400;

public class Shape {
    private String color;
    private int numSides;

    public Shape (String color, int side) {
        this.color = color;
        this.numSides = side;
    }

    public String getColor() {
        return color;
    }

    public int getNumSides() {
        return numSides;
    }

    public double getArea() {
        return 0;
    }
}