package ca.nscc;

public class CarDriver extends Operator implements Insurable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }
    public String provincialMasterNumber;

    @Override
    public void renewLicense() {
        System.out.println("Applied to renew provincial driver's license.");
    }
}
