package ca.prog1400;

// superClass

import javax.swing.*;

public class Person {
    //set variables
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void emptyInput() {
        JOptionPane.showMessageDialog(null,
                "Please enter valid information");
    }



    public String toString() {
        return "name = " + this.name + ", address = " + this.address + ", ";
    }
}
