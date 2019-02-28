package ca.prog1400;

/*
    Author : Woojin Oh
    Date : Feb. 19, 2019
    Description : PROG1400 ASSIGNMENT 2 - College Accounting Application
    File name : Person.java
*/

public abstract class Person {
    // Variables or properties
    private String personName;
    private String personAddress;

    // Constructors
    public Person(String personName, String personAddress) {
        this.personName = personName;
        this.personAddress = personAddress;
    }

    // get person name
    public String getPersonName() {
        return personName;
    }

    // get person address
    public String getPersonAddress() {
        return personAddress;
    }
}
