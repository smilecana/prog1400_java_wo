package ca.prog1400.ui;

import ca.prog1400.Main;
import ca.prog1400.common.LogToFile;
import ca.prog1400.common.SelAnimal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportPanel extends JPanel {
    private Font font = new  Font("Gothic", Font.BOLD, 15);

    private JLabel subTitleLabel;

    private JTextArea entriesTextArea;
    private JScrollPane entriesScrollPane;
    private JTextArea gpsTextArea;
    private JScrollPane gpsScrollPane;

    private JButton showEntriesButton;
    private JButton showGpsButton;
    private JButton backButton;

    public ReportPanel() {
        subTitleLabel = new JLabel("Reports");
        subTitleLabel.setFont(font);
        subTitleLabel.setBounds(10, 0, 150, 20);
        add(subTitleLabel);

        entriesTextArea = new JTextArea();
        entriesTextArea.setEditable(false);
        entriesScrollPane = new JScrollPane(entriesTextArea);
        entriesScrollPane.setBounds(10, 30, 790, 170);
        entriesScrollPane.setBackground(Color.WHITE);
        this.add(entriesScrollPane);
        entriesScrollPane.setVisible(false);

        gpsTextArea = new JTextArea();
        gpsTextArea.setEditable(false);
        gpsScrollPane = new JScrollPane(gpsTextArea);
        gpsScrollPane.setBounds(10, 30, 790, 170);
        gpsScrollPane.setBackground(Color.WHITE);
        this.add(gpsScrollPane);
        gpsScrollPane.setVisible(true);

        showEntriesButton = new JButton("Show New Entries");
        showEntriesButton.setFont(font);
        showEntriesButton.setBounds(120, 210, 180, 25);
        showEntriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display entries
                entriesTextArea.setText(MainPanel.getEntriesReport());
                entriesScrollPane.setVisible(true);
                gpsScrollPane.setVisible(false);
            }
        });
        add(showEntriesButton);

        showGpsButton = new JButton("Show GPS Logs");
        showGpsButton.setFont(font);
        showGpsButton.setBounds(310, 210, 180, 25);
        showGpsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display gps log
                gpsTextArea.setText(LogToFile.getTxtFileAsString());
                entriesScrollPane.setVisible(false);
                gpsScrollPane.setVisible(true);
            }
        });
        add(showGpsButton);

        backButton = new JButton("Back");
        backButton.setFont(font);
        backButton.setBounds(500, 210, 180, 25);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entriesScrollPane.setVisible(false);
                gpsScrollPane.setVisible(true);
                gpsTextArea.setText("");
                MainPanel.getGpsArrayList().clear();
                MainFrame.getMainPanel().setVisible(true);
                MainPanel.getReportPanel().setVisible(false);
            }
        });
        add(backButton);
    }
}
