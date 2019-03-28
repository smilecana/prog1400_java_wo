package ca.nscc;

public class Airplane extends Vehicle implements Insurable{
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    public double wingLength;

    @Override
    public void makeSound() {
        System.out.println("Planes go swoosh!!");
    }

    public void doPlaneStuff() {
        System.out.println("Doin some plane stuff.");
    }
}
