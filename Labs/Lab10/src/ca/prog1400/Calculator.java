package ca.prog1400;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField circleTextField;

    public Calculator() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shape Calculator");

        setBounds(100, 100, 500, 250);
        setVisible(true);
        setLayout(null);

        // Add button
        JRadioButton circleButton = new JRadioButton("Circle");
        circleButton.setBounds(50, 50, 150, 20);
        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (circleTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please input the number.", "Area of Circle", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    Circle circle = new Circle(Double.parseDouble(circleTextField.getText()));
                    if (Double.parseDouble(circleTextField.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "Please input the number bigger than 0.", "Area of Circle", JOptionPane.WARNING_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Area of Circle: " + String.format("%.2f", circle.getArea()), "Area of Circle", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        add(circleButton);

        JRadioButton triangleButton = new JRadioButton("Triangle");
        triangleButton.setBounds(50, 90, 150, 20);
        add(triangleButton);

        JRadioButton rectangleButton = new JRadioButton("Rectangle");
        rectangleButton.setBounds(50, 130, 150, 20);
        add(rectangleButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(circleButton);
        buttonGroup.add(triangleButton);
        buttonGroup.add(rectangleButton);

        // Add a label for textfield
        JLabel circleTextFieldLabel = new JLabel("Radius:");
        circleTextFieldLabel.setBounds(200, 50, 50, 20);
        add(circleTextFieldLabel);

        // Add a textfield
        circleTextField = new JTextField();
        circleTextField.setBounds(280, 50, 70, 20);
        add(circleTextField);
    }
}
