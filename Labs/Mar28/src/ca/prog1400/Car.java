package ca.prog1400;

public class Car extends Vehicle implements Insurable {
    @Override
    public void move() {
        System.out.println("vroom vroom");
    }

    @Override
    public void setRate() {
        System.out.println("setting rate for Car");
    }

    @Override
    public void setTerm() {
        System.out.println("setting term for Car");
    }
}
