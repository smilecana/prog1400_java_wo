package ca.prog1400.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GameFrame extends JFrame {
    private static JPanel contentPanel;
    private static MainPanel panelMain;
    private static SelectPanel panelSelChar;

    public GameFrame() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DND Game");
        setLayout(null); // Absolute positioning
        setBounds(100, 100, 525, 570);

        //make contentPanel
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 30, 5, 30));
        setContentPane(contentPanel);
        contentPanel.setLayout(new CardLayout(0, 0));

        // main panel
        panelMain = new MainPanel();
        contentPanel.add(panelMain);
        panelMain.setLayout(null);

        // character select panel
        panelSelChar = new SelectPanel();
        contentPanel.add(panelSelChar);
        panelSelChar.setLayout(null);
    }

    public static JPanel getContentPanel() {
        return contentPanel;
    }

    public static MainPanel getPanelMain() {
        return panelMain;
    }

    public static SelectPanel getPanelSelChar() {
        return panelSelChar;
    }
}
