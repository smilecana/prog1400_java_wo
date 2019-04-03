package ca.prog1400.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainFrame extends JFrame {
    private static JPanel contentPanel;
    private static MainPanel mainPanel;

    public MainFrame() {
        super();
        setTitle("Antarctic Animal Tracking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 845, 300);

        //make contentPanel
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPanel);
        contentPanel.setLayout(new CardLayout(0, 0));

        // make main panel
        mainPanel = new MainPanel();
        contentPanel.add(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.setVisible(true);
    }

    public static JPanel getContentPanel() {
        return contentPanel;
    }

    public static MainPanel getMainPanel() {
        return mainPanel;
    }
}
