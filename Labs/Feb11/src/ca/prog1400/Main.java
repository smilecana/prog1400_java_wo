package ca.prog1400;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Simple message dialog
//        JOptionPane.showMessageDialog(null, "Danger Will Robinson!", "Intro OOP", JOptionPane.ERROR_MESSAGE);

        // Warning dialog
//        JOptionPane.showMessageDialog(null, "Be careful!", "Intro OOP", JOptionPane.WARNING_MESSAGE);

        // Basic confirm dialog
//        int val = JOptionPane.showConfirmDialog(null, "Further Confirm", "OOP Demo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//        System.out.println("Return value was " + val);

//        String userInput = JOptionPane.showInputDialog("Gimme a number between 1 to 10");
//        System.out.println("userInput = " + userInput);

/*        Object[] myButtons = {"Red", "Green", "Blue"};

        int val = JOptionPane.showOptionDialog(null, "What's your fave colour?", "Intro OOP", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, myButtons, myButtons[1]);

        System.out.println("val = " + val);
        */

        // ArrayList
        ArrayList<String> strings =  new ArrayList<>();
        strings.add("My");
        strings.add("Name");
        strings.add("Is");
        strings.add("Woojin");
        strings.add("Name");

        /*
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("String is " + strings.get(i));
        }
        */

        // Empty out the array list
        /*
        strings.clear();
        System.out.println("strings.size() = " + strings.size());
        */

        /*
        System.out.println("strings.contains(\"Name\") = " + strings.contains("Name"));
        System.out.println("strings.indexOf(\"Name\") = " + strings.indexOf("Name"));
        System.out.println("strings.indexOf(\"Name\") = " + strings.lastIndexOf("Name"));
        */

        for (String currentString: strings) {
            System.out.println("currentString = " + currentString);
        }

    }
}
