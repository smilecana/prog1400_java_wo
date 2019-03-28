package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends PanelBase {

    private JTextArea displayText;

    public DisplayPanel() {
//
//        Font myFont = new Font("Calibri", Font.BOLD, 24);
//
//        //Set Panel Properties
//        setLayout(null);

        super();

        JLabel choiceLabel = new JLabel("Your choice of shape is:");
        choiceLabel.setFont(myFont);
        choiceLabel.setBounds(50, 10, 250, 50);

        displayText = new JTextArea();
        displayText.setBounds(50, 50, 500, 200);
        displayText.setFont(myFont);
        displayText.setLineWrap(true);
        displayText.setEnabled(false);
        displayText.setWrapStyleWord(true);

        add(choiceLabel);
        add(displayText);
    }

    public void displayChoice() {
        String text = "";
        Circle circle = MainFrame.getTheCircle();
        Rectangle rectangle = MainFrame.getTheRectangle();
        Triangle triangle = MainFrame.getTheTriangle();

        if (circle != null && circle.getName() != null) {
            text = circle.toString();
        } else if (rectangle != null && rectangle.getName() != null) {
            text = rectangle.toString();
        } else if (triangle != null && triangle.getName() != null) {
            text = triangle.toString();
        }
        displayText.setText(text);
    }
}
