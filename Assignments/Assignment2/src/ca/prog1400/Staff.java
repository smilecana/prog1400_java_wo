package ca.prog1400;

import java.util.ArrayList;

/*
    Author : Woojin Oh
    Date : Feb. 16, 2019
    Description : PROG1400 ASSIGNMENT 2 - College Accounting Application
    File name : Staff.java
*/

public class Staff extends Person {
    // Variables or properties
    private int serviceYear;
    private double staffPay = 50000;

    // Constructors
    public Staff(String personName, String personAddress, int serviceYear) {
        super(personName, personAddress);
        this.serviceYear = serviceYear;
    }

    // get total outgoing
    public static String getOutgoing(ArrayList<Staff> staffs) {
        double staffOutgoing = 0;

        for (int i = 0; i < staffs.size(); i++)
        {
            staffOutgoing += staffs.get(i).staffPay;
        }

        staffOutgoing = staffOutgoing / 26;

        return String.format("%.2f", staffOutgoing);
    }

    @Override
    // get output string
    public String toString() {
        staffPay += 500 * this.serviceYear;

        return String.format("name = %s, address = %s, years = %d, pay = $%.2f", super.getPersonName(), super.getPersonAddress(), this.serviceYear, staffPay);
    }
}
