package ca.prog1400.ui;

import javax.swing.*;
import java.awt.*;

public abstract class MainPanel extends JPanel {
    private Font font = new  Font("Gothic", Font.BOLD, 15);

    private JLabel subTitleLabel;
    private JLabel animalLabel;
    private JLabel genderLabel;
    private JLabel weightLabel;

    private String[] animal;
    private JComboBox<String> animalDropBox;

    public MainPanel() {
        subTitleLabel = new JLabel("Animal Observed:");
        subTitleLabel.setFont(font);
        subTitleLabel.setBounds(10, 10, 150, 20);
        add(subTitleLabel);

        animalLabel = new JLabel("Animal");
        animalLabel.setFont(font);
        animalLabel.setBounds(10, 40, 150, 20);
        add(animalLabel);

        animal = new String[] {"Penguin", "Sea Lion", "Walrus"};
        animalDropBox = new JComboBox<String>(animal);
        animalDropBox.setFont(font);
        animalDropBox.setBounds(170, 40, 100, 25);
        add(animalDropBox);

        genderLabel = new JLabel("Gender");
        genderLabel.setFont(font);
        genderLabel.setBounds(10, 70, 150, 20);
        add(genderLabel);

        weightLabel = new JLabel("Weight in Kg");
        weightLabel.setFont(font);
        weightLabel.setBounds(10, 100, 150, 20);
        add(weightLabel);
    }
}
