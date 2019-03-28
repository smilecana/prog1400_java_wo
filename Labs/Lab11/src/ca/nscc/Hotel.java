package ca.nscc;

public class Hotel extends Building implements Insurable, Rentable {
    @Override
    public void setRate() {

    }

    @Override
    public void setTerm() {

    }

    @Override
    public void setRentalRate() {
        System.out.println("This hotel can be rented for $150/day");
    }

    @Override
    public void setDuration() {
        System.out.println("This hotel can be rented minimum 1day");
    }

    public String franchiseName;

    public void orderRoomService() {
        System.out.println("Order breakfast from room service");
    }

    public void requestWakeUpCall() {

        System.out.println("Wake-up call for 5:30 AM, please.");
    }
}
