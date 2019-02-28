package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        Jet jet = new Jet(200);
        System.out.println("Jet speed = " + jet.getSpeed());
        Car car = new Car(100);
        System.out.println("Car speed = " + car.getSpeed());
    }
}
