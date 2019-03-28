package ca.nscc;

public class Boat extends Vehicle implements Insurable, Rentable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    @Override
    public void setRentalRate() {
        System.out.println("This boat can be rented for $150/day");
    }

    @Override
    public void setDuration() {
        System.out.println("This boat can be rented minimum 1day");
    }

    @Override
    public void makeSound() {
        System.out.println("Boats go splishy splashy!");
    }

    public void doBoatStuff() {
        System.out.println("Doin some boat stuff.");
    }

}
