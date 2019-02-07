package ca.prog1400;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(String color, int numSides, double width, double height) {
        super(color, numSides);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height * 0.5;
    }
}