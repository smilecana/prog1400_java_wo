package ca.nscc;

public class Boat extends Vehicle {

    @Override
    public void makeSound() {
        System.out.println("Boats go splishy splashy!");
    }

    public void doBoatStuff() {
        System.out.println("Doin some boat stuff.");
    }

}
