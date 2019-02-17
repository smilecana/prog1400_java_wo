package ca.prog1400;

import java.util.ArrayList;

public class Staff extends Person {
    int serviceYear;
    double staffPay = 50000;

    public Staff(String personName, String personAddress, int serviceYear) {
        super(personName, personAddress);
        this.serviceYear = serviceYear;
    }

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
    public String toString() {
        staffPay += 500 * this.serviceYear;

        return String.format("name = %s, address = %s, years = %d, pay = $%.2f", super.getPersonName(), super.getPersonAddress(), this.serviceYear, staffPay);
    }
}
