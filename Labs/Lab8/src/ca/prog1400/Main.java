package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // welcome popup message
        JOptionPane.showMessageDialog(null, "Welcome to the party Picker.\n\nEnter person's name and the type of food they're likely to bring,\nthen indicate whether they are actually invited to the party or not.");

        ArrayList<Friend> friends = new ArrayList<>();
        Object[] myButtons = {"Invited", "Not Invited"};

        int continueSelector = 0;
        String resultString = "";

        do {
            boolean booleanInvited = false;

            String userInputFirstName = JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String userInputLastName = JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String userInputFood = JOptionPane.showInputDialog(null, "Enter the food they usually bring", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            int userSelecrInvited = JOptionPane.showOptionDialog(null, "Choose if this guested is Invited or Not invited", "Party Picker", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, myButtons, myButtons[0]);
            continueSelector = JOptionPane.showConfirmDialog(null, "Enter another guest", "Party Picker", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (userSelecrInvited == 0) {
                booleanInvited = true;
            }
            else if (userSelecrInvited == 1) {
                booleanInvited = false;
            }

            Friend friend = new Friend(userInputFirstName, userInputLastName, booleanInvited, userInputFood);
            friends.add(friend);
        } while (continueSelector == 0);

        for(Friend currentString: friends) {
            resultString += currentString+"\n";
        }
        JOptionPane.showMessageDialog(null, "Guests:\n\n" + resultString);
    }
}
