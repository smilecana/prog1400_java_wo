package ca.nscc;

public class Castle extends Building implements Insurable, Rentable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    @Override
    public void setRentalRate() {
        System.out.println("This castle can be rented for $500/day");
    }

    @Override
    public void setDuration() {
        System.out.println("This castle can be rented minimum 3days");
    }

    public int numOfTowers;

    public void lowerDrawbridge() {
        System.out.println("Abandon hope, all ye who enter here.");
    }

    public void raiseDrawbridge() {
        System.out.println("Bring out the trebuchets, siege time!");
    }

}
