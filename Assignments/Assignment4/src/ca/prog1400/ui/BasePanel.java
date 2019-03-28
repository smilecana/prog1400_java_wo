package ca.prog1400.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BasePanel extends JPanel {
    Font font = new  Font("Gothic", Font.BOLD, 15);

    public BasePanel() {
        super();
        setBounds(100, 100, 830, 300);
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(null);
    }

    public JPanel jPanel(int x, int y, int w, int h) {
        JPanel jPanel = new JPanel();
        jPanel.setBounds(x, y, w, h);
        jPanel.setLayout(null);
        return jPanel;
    }

    public JLabel jTextLabel(String txt, int x, int y, int w) {
        JLabel jLabel = new JLabel(txt);
        jLabel.setFont(font);
        jLabel.setBounds(x, y, w, 20);
        return jLabel;
    }

    public JComboBox jDropBox(String[] string, int x, int y) {
        JComboBox<String> jComboBox = new JComboBox<String>(string);
        jComboBox.setFont(font);
        jComboBox.setBounds(x, y, 100, 25);
        return jComboBox;
    }

    public JTextField inputTextField(int x, int y, int w, int h) {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(x, y, w, h);
        return jTextField;
    }

    public JTextField readTextField(int x, int y, int w, int h) {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(x, y, w, h);
        jTextField.setBackground(Color.WHITE);
        jTextField.setEditable(false);
        return jTextField;
    }

    public JButton jButton(String txt, int x, int y, int w, int h) {
        JButton jButton = new JButton(txt);
        jButton.setFont(font);
        jButton.setBounds(x, y, w, h);
        return jButton;
    }
}
