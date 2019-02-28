package ca.prog1400.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoUI extends JFrame {
    private JTextField textField;
    private JTextArea textArea;

    public DemoUI() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Feb 28 Demo");
        setBounds(10, 10, 500, 400);
        setVisible(true);
        setLayout(null); // Absolute positioning

        // Add label for images
        JLabel label = new JLabel("Demo");
        //label.setBackground(Color.DARK_GRAY);
        //label.setOpaque(true); // To show its own background.
        label.setBounds(20, 20, 250, 250);

        // Add an image
        label.setIcon(new ImageIcon(
                getClass().getResource("/images/poodle.jpg")));

        add(label);

        // Add button
        JRadioButton button1 = new JRadioButton("yes");
        button1.setBounds(280, 30, 100, 20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked Yes");
            }
        });
        add(button1);

        JRadioButton button2 = new JRadioButton("no");
        button2.setBounds(410, 30, 100, 20);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Why don't you like poodles?");
                System.out.println(textField.getText());
            }
        });
        add(button2);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);

        // Add a textfield
        textField = new JTextField();
        textField.setBounds(280, 60, 200, 20);
        //textField.setText("Hello");
        add(textField);

        // Add a text Area
        textArea = new JTextArea();
        JScrollPane pane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        pane.setBounds(280, 100, 200, 200);
        add(pane);
    }
}
