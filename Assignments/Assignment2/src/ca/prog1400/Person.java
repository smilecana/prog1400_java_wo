package ca.prog1400;

public class Person {
    private String personName;
    private String personAddress;

    public Person(String personName, String personAddress) {
        this.personName = personName;
        this.personAddress = personAddress;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }
}
