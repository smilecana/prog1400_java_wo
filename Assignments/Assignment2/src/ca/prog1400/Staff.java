package ca.prog1400;

import java.util.ArrayList;

/*
    Author : Woojin Oh
    Date : Feb. 19, 2019
    Description : PROG1400 ASSIGNMENT 2 - College Accounting Application
    File name : Staff.java
*/

public class Staff extends Person {
    // Variables or properties
    private int serviceYear;
    private double staffPay;
    private double staffBasicPay = 50000;
    private double staffPayIncreaseByYear = 500;

    // Constructors
    public Staff(String personName, String personAddress, int serviceYear) {
        super(personName, personAddress);
        this.serviceYear = serviceYear;
        this.staffPay = staffBasicPay + staffPayIncreaseByYear * serviceYear;
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
        return String.format("name = %s, address = %s, years = %d, pay = $%.2f", super.getPersonName(), super.getPersonAddress(), this.serviceYear, this.staffPay);
    }
}
