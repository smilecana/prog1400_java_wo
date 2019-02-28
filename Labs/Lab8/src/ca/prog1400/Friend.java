package ca.prog1400;

public class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString() {
        String friendDetails = "";
        String invited = "";

        if (!isInvited()) {
            invited = "NOT ";
        }

        friendDetails += getFullName() + "is bringing " + this.foodToBring + ". They are " + invited + "invited to the party.";

        return friendDetails;
    }

    @Override
    public String getFullName() {
        return "I'm a friend! My full name is " + super.getFullName();
    }

    @Override
    public void goToParty() {
        System.out.println("I am going to the party. Yay!\n" + "Better bring the " + foodToBring);
    }
}