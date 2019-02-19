package ca.prog1400;

import java.util.ArrayList;

/*
    Author : Woojin Oh
    Date : Feb. 19, 2019
    Description : PROG1400 ASSIGNMENT 2 - College Accounting Application
    File name : Student.java
*/

public class Student extends Person {
    // Variables or properties
    private int studentYear;
    private double studentFee;
    private double studentBasicFee = 3000;
    private double studentFeeIncreaseByYear = 100;

    // Constructors
    public Student(String personName, String personAddress, int studentYear) {
        super(personName, personAddress);
        this.studentYear = studentYear;
        this.studentFee = studentBasicFee + studentFeeIncreaseByYear * (studentYear - 1);
    }

    // get total incoming
    public static String getIncoming(ArrayList<Student> students) {
        double studentIncoming = 0;

        for (int i = 0; i < students.size(); i++)
        {
            studentIncoming += students.get(i).studentFee;
        }
        studentIncoming = studentIncoming / 2;

        return String.format("%.2f", studentIncoming);
    }

    @Override
    // get output string
    public String toString() {
        return String.format("name = %s, address = %s, year = %d, fee = $%.2f", super.getPersonName(), super.getPersonAddress(), this.studentYear, this.studentFee);
    }
}
