package ca.prog1400;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("red", 0, 3);
        System.out.println("Circle");
        System.out.println("Color: " + circle.getColor() + "Number of sides: " + circle.getNumSides());
        System.out.println("Area: " + circle.getArea() + "\n");

        Square square = new Square("red", 4, 2, 5);
        System.out.println("Square");
        System.out.println("Color: " + square.getColor() + "Number of sides: " + square.getNumSides());
        System.out.println("Area: " + square.getArea() + "\n");

        Triangle triangle = new Triangle("red", 3, 2, 5);
        System.out.println("Triangle");
        System.out.println("Color: " + triangle.getColor() + "Number of sides: " + triangle.getNumSides());
        System.out.println("Area: " + triangle.getArea() + "\n");
    }
}
