package ca.prog1400;

public abstract class Person {
    private String firstName;
    private String lastName;
    private boolean isInvited;

    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    // This is an abstact method. No body.
    // I want all subclasses to implement this method.
    public abstract void goToParty();

    public boolean isInvited() {
        return isInvited;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
