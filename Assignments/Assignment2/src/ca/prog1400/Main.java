package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;

/*
    Author : Woojin Oh
    Date : Feb. 19, 2019
    Description : PROG1400 ASSIGNMENT 2 - College Accounting Application
    File name : Main.java
*/

public class Main {

    // function for validating student year
    public static String validateStudentYear(String inputString) {
        // if input is empty, show warning message
        if (inputString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        // if input is not a positive number, show warning message
        else if (!inputString.matches("^[0-9]+$"))
        {
            JOptionPane.showMessageDialog(null, "Please enter a positive number.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        // if input is 0 or bigger than 4, show warning message
        else if (Integer.parseInt(inputString) < 1 || Integer.parseInt(inputString) > 4) {

            JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 4.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        return "done";
    }

    // function for validating staff year
    public static String validateStaffYear(String inputString) {
        // if input is empty, show warning message
        if (inputString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid information.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        // if input is not a positive number, show warning message
        else if (!inputString.matches("^[0-9]+$"))
        {
            JOptionPane.showMessageDialog(null, "Please enter a positive number.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        // if input is 0 or bigger than 30, show warning message
        else if (Integer.parseInt(inputString) < 1 || Integer.parseInt(inputString) > 30) {
            JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30.", "Message", JOptionPane.WARNING_MESSAGE);
            return "retry";
        }
        return "done";
    }

    // function for validating empty string input
    public static String validateStringEmpty(String inputString) {
        if (!inputString.isEmpty()) {
            return "done";
        }
        // if input is empty, show warning message
        JOptionPane.showMessageDialog(null, "Please enter valid information.", "Message", JOptionPane.WARNING_MESSAGE);
        return "retry";
    }

    public static void main(String[] args) {
        // make array list to store the information of students and staffs
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();

        // define variables
        int userStarterSelect;
        String studentResultString = "";
        String staffResultString = "";
        String finalResultString;
        String totalMoney;

        // get the user input
        do {
            Object[] starterButtons = {"Student", "Staff", "Finish"};
            String studentYearInput;
            String studentNameInput;
            String studentAddressInput;
            String staffNameInput;
            String staffAddressInput;
            String staffYearInput;
            String returnValue;

            // start up with a dialog that asks the user to enter Student, Staff or Finish
            userStarterSelect = JOptionPane.showOptionDialog(null, "Select Student or Staff", "Accounting App", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, starterButtons, starterButtons[0]);

            // if user select Student
            if (userStarterSelect == 0) {
                // dialog for asking student year
                do {
                    studentYearInput = JOptionPane.showInputDialog(null, "Enter student year (1-4)", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStudentYear(studentYearInput);
                }while (returnValue != "done");

                // dialog for asking student name
                do {
                    studentNameInput = JOptionPane.showInputDialog(null, "Enter Student Name", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStringEmpty(studentNameInput);
                }while (returnValue != "done");

                // dialog for asking student address
                do {
                    studentAddressInput = JOptionPane.showInputDialog(null, "Enter Student Address", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStringEmpty(studentAddressInput);
                }while (returnValue != "done");

                Student student = new Student(studentNameInput, studentAddressInput, Integer.parseInt(studentYearInput));
                students.add(student);
            }
            // if user select Staff
            else if (userStarterSelect == 1) {
                // dialog for asking staff name
                do {
                    staffNameInput = JOptionPane.showInputDialog(null, "Enter Staff Name", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStringEmpty(staffNameInput);
                }while (returnValue != "done");

                // dialog for asking staff address
                do {
                    staffAddressInput = JOptionPane.showInputDialog(null, "Enter Staff Address", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStringEmpty(staffAddressInput);
                }while (returnValue != "done");

                // dialog for asking staff years of service
                do {
                    staffYearInput = JOptionPane.showInputDialog(null, "Enter staff years of service", "Input", JOptionPane.QUESTION_MESSAGE);
                    returnValue = validateStaffYear(staffYearInput);
                }while (returnValue != "done");

                Staff staff = new Staff(staffNameInput, staffAddressInput, Integer.parseInt(staffYearInput));
                staffs.add(staff);
            }
        }while (userStarterSelect != 2); // if user select Finish

        // store each result about students with string format
        for (int i = 0; i < students.size(); i++) {
            studentResultString += (i + 1) + "." + students.get(i) + "\n";
        }

        // store each result about staffs with string format
        for (int i = 0; i < staffs.size(); i++) {
            staffResultString += (i + 1) + "." + staffs.get(i) + "\n";
        }

        // get totalMoney that difference incoming and outgoing
        totalMoney = String.format("%.2f", Double.parseDouble(Student.getIncoming(students)) - Double.parseDouble(Staff.getOutgoing(staffs)));

        // final output sentence
        finalResultString = "Students [Total: " + students.size() + "]\n" + studentResultString + "Staff [Total: " + staffs.size() + "]\n" + staffResultString + "\n\n" + "Results:\nOutgoing: $" + Staff.getOutgoing(staffs) + "\nIncoming: $" + Student.getIncoming(students) + "\nTotal: $" + totalMoney;

        // output result on the screen
        JOptionPane.showMessageDialog(null, finalResultString);
    }
}