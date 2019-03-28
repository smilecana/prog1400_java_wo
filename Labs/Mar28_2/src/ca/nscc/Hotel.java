package ca.nscc;

public class Hotel extends Building{

    public String franchiseName;

    public void orderRoomService() {
        System.out.println("Order breakfast from room service");
    }

    public void requestWakeUpCall() {

        System.out.println("Wake-up call for 5:30 AM, please.");
    }
}
