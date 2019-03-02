package ca.prog1400;

public class Circle {
    private double radius;
    private String colour;

    public Circle() {
        this.radius = 2;
        this.colour = "green";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "green";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    public String getColour() {
        return colour;
    }

//    public void setColour(Color colour) {
//        this.colour = colour;
//    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return String.format("Radius = %.2f, Colour = %s, Area = %.2f", this.radius, this.colour, getArea());
    }
}
