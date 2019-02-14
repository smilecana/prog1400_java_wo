package ca.prog1400;

public class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    public String toString() {
        String invited = "";
        if (!super.isInvited()) {
            invited = "NOT ";
        }
        return super.getFullName() + " is bringing " + this.foodToBring + ". They are " + invited + "invited to the party.";
    }
}