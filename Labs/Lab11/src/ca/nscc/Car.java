package ca.nscc;

public class Car extends Vehicle implements Insurable, Rentable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    @Override
    public void setRentalRate() {
        System.out.println("This car can be rented for $80/day");
    }

    @Override
    public void setDuration() {
        System.out.println("This car can be rented minimum 1day");
    }

    @Override
    public void makeSound() {
        System.out.println("Cars go Beep Beep!");
    }

    public void doCarStuff() {
        System.out.println("Doin some car stuff.");
    }

}
