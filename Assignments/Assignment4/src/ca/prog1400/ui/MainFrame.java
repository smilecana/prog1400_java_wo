package ca.prog1400.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainFrame extends JFrame {
    private Font font = new  Font("Gothic", Font.BOLD, 15);

    private JPanel contentPane;
    private MainPanel mainPanel;

    private JLabel subTitleLabel;
    private JLabel animalLabel;
    private JLabel genderLabel;
    private JLabel weightLabel;

    private String[] animal;
    private JComboBox animalDropBox;

//    private String[] gender = new String[] {"Male", "Female"};
//    private JComboBox genderDropBox = jDropBox(gender, 170, 70);
//    private JTextField weightTextField = inputTextField(170, 100, 100, 25);
//    private JButton addEntryButton = jButton("Add Entry", 55, 160, 150, 25);
//    private JTextField addGpsTextField = inputTextField(300, 40, 370, 25);
//    private JButton addGpsButton = jButton("Add GPS", 680, 40, 120, 25);
//    private JTextField gpsTextField = readTextField(300, 70, 500, 115);
//    private JButton viewReportButton = jButton("View Reports", 650, 210, 150, 25);

    public MainFrame() {
        super();
        setTitle("Antarctic Animal Tracking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 830, 300);

        //make contentPanel
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        // main panel
        mainPanel = new MainPanel();
        contentPane.add(mainPanel);
        mainPanel.setLayout(null);
    }
}
