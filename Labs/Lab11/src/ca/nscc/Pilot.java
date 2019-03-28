package ca.nscc;

public class Pilot extends Operator implements Insurable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    public int loggedHours;

    @Override
    public void renewLicense() {
        System.out.println("Applied to renew pilot's license.");
    }
}
