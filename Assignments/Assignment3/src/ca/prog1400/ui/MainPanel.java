package ca.prog1400.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    private JLabel labelMainTitle;
    private JLabel labelMainImage;

    private JButton btnMainStart;

    public MainPanel() {
        super();
        // main panel title
        labelMainTitle = new JLabel("Dragons and Dungeons", SwingConstants.CENTER);
        labelMainTitle.setFont(new Font("Old English Text MT", Font.BOLD, 25));
        labelMainTitle.setBounds(0, 45, 450, 25);
        add(labelMainTitle);

        // main panel image
        labelMainImage = new JLabel();
        labelMainImage.setIcon(new ImageIcon(getClass().getResource("/images/mainImage.jpg")));
        labelMainImage.setBounds(0, 80, 450, 262);
        add(labelMainImage);

        // main panel button
        btnMainStart = new JButton("Build A Character");
        btnMainStart.setFont(new Font("Old English Text MT", Font.BOLD, 15));
        btnMainStart.setBounds(135, 363, 180, 25);
        btnMainStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame.getPanelMain().setVisible(false);
                GameFrame.getPanelSelChar().setVisible(true);
            }
        });
        add(btnMainStart);
    }
}
