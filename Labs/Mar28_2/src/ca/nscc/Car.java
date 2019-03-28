package ca.nscc;

public class Car extends Vehicle  {

    @Override
    public void makeSound() {
        System.out.println("Cars go Beep Beep!");
    }

    public void doCarStuff() {
        System.out.println("Doin some car stuff.");
    }

}
