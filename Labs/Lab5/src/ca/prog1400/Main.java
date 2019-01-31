package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        Circle [] circle = new Circle[3];

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(8, "yellow");

        circle[0] = circle1;
        circle[1] = circle2;
        circle[2] = circle3;

        for (int i = 0; i < circle.length; i++) {
            Circle currentCircle = circle[i];
            System.out.println(currentCircle);
        }
    }
}

