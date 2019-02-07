package ca.prog1400;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, int numSides, double radius) {
        super(color, numSides);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}