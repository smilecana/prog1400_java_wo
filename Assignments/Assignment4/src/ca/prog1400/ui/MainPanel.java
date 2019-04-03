package ca.prog1400.ui;

import ca.prog1400.classes.GPS;
import ca.prog1400.common.SelAnimal;
import ca.prog1400.common.Validate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MainPanel extends JPanel {
    private Font font = new  Font("Gothic", Font.BOLD, 15);

    private JLabel subTitleLabel;
    private JLabel animalLabel;
    private JLabel genderLabel;
    private JLabel gpsLabel;
    private JLabel weightLabel;
    private JLabel bloodLabel;
    private JLabel spotLabel;
    private JLabel dentalLabel;

    private JTextArea weightTextArea;
    private JTextArea bloodTextArea;
    private JTextArea spotTextArea;
    private JTextArea addGpsTextArea;
    private JTextArea gpsTextArea;

    private String[] animal;
    private String[] gender;
    private String[] dental;

    private static JComboBox<String> animalDropBox;
    private JComboBox<String> genderDropBox;
    private JComboBox<String> dentalDropBox;

    private JButton addEntryButton;
    private JButton addGpsButton;
    private JButton viewReportButton;

    private GPS gps;
    private static ArrayList<GPS> gpsArrayList = new ArrayList<>();

    private static String selSpecies;
    private static String selSex;
    private static int selWeight;
    private static double selBloodPressure;
    private static int selNumSpots;
    private static String selDentalHealth;
    private static String entriesReport = "";
    private String gpsValidateMessage = "Invalid GPS format:\n"
            + "Latitude values range from -90 to 90.\n" + "Longitudes values range from -180 to 180.\n"
            + "Both values must have 7 digits after the decimal.\n"
            + "Separate latitude and longitude values with a space.\n"
            + "(-)##.####### (-)(## or ###).#######";
    private String emptyGpsValidateMessage = "At least one GPS location must be entered.";
    private String weightValidateMessage = "[Weight]: Invalid input:\n"
            + "Enter a whole number greater than 0";
    private String bloodValidateMessage = "[Blood Pressure]: Invalid input:\n"
            + "Enter a double number greater than 0";
    private String spotValidateMessage = "[The number of Spots]: Invalid input:\n"
            + "Enter a whole number greater than 0";

    private static ReportPanel reportPanel;

    //private Border border = BorderFactory.createLineBorder(new Color(122, 138, 153), 1);

    public MainPanel() {
        subTitleLabel = new JLabel("Animal Observed:");
        subTitleLabel.setFont(font);
        subTitleLabel.setBounds(10, 10, 150, 20);
        add(subTitleLabel);

        animalLabel = new JLabel("Animal");
        animalLabel.setFont(font);
        animalLabel.setBounds(10, 40, 150, 20);
        add(animalLabel);

        // make dropbox for animal
        animal = new String[] {"Penguin", "Sea Lion", "Walrus"};
        animalDropBox = new JComboBox<String>(animal);
        animalDropBox.setFont(font);
        animalDropBox.setBounds(170, 40, 100, 25);
        animalDropBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // make clear animal dropbox
                makeClear("animalDropBox");
                // change panel by selected animal
                toggleDisplay(animalDropBox.getSelectedItem().toString());
            }
        });
        add(animalDropBox);

        genderLabel = new JLabel("Gender");
        genderLabel.setFont(font);
        genderLabel.setBounds(10, 70, 150, 20);
        add(genderLabel);

        // make dropbox for gender
        gender = new String[] {"Male", "Female"};
        genderDropBox = new JComboBox<String>(gender);
        genderDropBox.setFont(font);
        genderDropBox.setBounds(170, 70, 100, 25);
        add(genderDropBox);

        weightLabel = new JLabel("Weight in Kg");
        weightLabel.setFont(font);
        weightLabel.setBounds(10, 100, 150, 20);
        add(weightLabel);

        weightTextArea  = new JTextArea();
        weightTextArea.setBounds(170, 100, 100, 25);
//        // set the border of this component
//        weightTextArea.setBorder(border);
        add(weightTextArea);

        bloodLabel = new JLabel("Blood Pressure");
        bloodLabel.setFont(font);
        bloodLabel.setBounds(10, 130, 150, 20);
        add(bloodLabel);

        bloodTextArea  = new JTextArea();
        bloodTextArea.setBounds(170, 130, 100, 25);
//        // set the border of this component
//        bloodTextArea.setBorder(border);
        add(bloodTextArea);

        spotLabel = new JLabel("# of Spots");
        spotLabel.setFont(font);
        spotLabel.setBounds(10, 130, 150, 20);
        add(spotLabel);
        spotLabel.setVisible(false);

        spotTextArea  = new JTextArea();
        spotTextArea.setBounds(170, 130, 100, 25);
//        // set the border of this component
//        spotTextArea.setBorder(border);
        add(spotTextArea);
        spotTextArea.setVisible(false);

        dentalLabel = new JLabel("Dental Health");
        dentalLabel.setFont(font);
        dentalLabel.setBounds(10, 130, 150, 20);
        add(dentalLabel);
        dentalLabel.setVisible(false);

        // make dropbox for dental health
        dental = new String[] {"Good", "Average", "Poor"};
        dentalDropBox = new JComboBox<String>(dental);
        dentalDropBox.setFont(font);
        dentalDropBox.setBounds(170, 130, 100, 25);
        add(dentalDropBox);
        dentalDropBox.setVisible(false);

        gpsLabel = new JLabel("GPS Coordinates: (-)##.####### (-)(## or ###).#######");
        gpsLabel.setFont(font);
        gpsLabel.setBounds(300, 10, 400, 20);
        add(gpsLabel);

        addGpsTextArea = new JTextArea();
        addGpsTextArea.setBounds(300, 40, 370, 25);
//        // set the border of this component
//        addGpsTextArea.setBorder(border);
        add(addGpsTextArea);

        addGpsButton = new JButton("Add GPS");
        addGpsButton.setFont(font);
        addGpsButton.setBounds(680, 40, 120, 25);
        addGpsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // validate for gps
                if (!Validate.validateGPS(addGpsTextArea.getText())) {
                    JOptionPane.showMessageDialog(null, gpsValidateMessage, "Message", JOptionPane.WARNING_MESSAGE);
                } else {
                    // store gps data in array list
                    gpsTextArea.setText("");
                    String[] inputGPS = addGpsTextArea.getText().split(" ");
                    gps = new GPS(inputGPS[0], inputGPS[1]);
                    gpsArrayList.add(gps);
                    // output to console for debugging
                    gps.gpsLogToConsole();
                    // output gps data
                    for(GPS i: gpsArrayList) {
                        gpsTextArea.append(i.getLatitude() + " " + i.getLongitude() + "\n");
                    }
                    addGpsTextArea.setText("");
                }
            }
        });
        add(addGpsButton);

        gpsTextArea = new JTextArea();
        gpsTextArea.setBounds(300, 70, 500, 115);
        gpsTextArea.setBackground(Color.WHITE);
//        // set the border of this component
//        gpsTextArea.setBorder(border);
        gpsTextArea.setEditable(false);
        add(gpsTextArea);

        addEntryButton = new JButton("Add Entry");
        addEntryButton.setFont(font);
        addEntryButton.setBounds(55, 160, 150, 25);
        addEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selSpecies = animalDropBox.getSelectedItem().toString();
                selSex  = genderDropBox.getSelectedItem().toString();

                if (gpsTextArea.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, emptyGpsValidateMessage, "Message", JOptionPane.WARNING_MESSAGE);
                } else {
                    // validate for weight
                    if (!Validate.validateWholeNumber(weightTextArea.getText())) {
                        JOptionPane.showMessageDialog(null, weightValidateMessage, "Message", JOptionPane.WARNING_MESSAGE);
                    } else {
                        selWeight = Integer.parseInt(weightTextArea.getText());
                        switch (selSpecies) {
                            case "Penguin":
                                // validate for blood pressure
                                if (!Validate.validateDouble(bloodTextArea.getText())) {
                                    JOptionPane.showMessageDialog(null, bloodValidateMessage, "Message", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    selBloodPressure = Double.parseDouble(bloodTextArea.getText());
                                    makeAnimalObject();
                                }
                                break;
                            case "Sea Lion":
                                // validate for the number of spot
                                if (!Validate.validateWholeNumber(spotTextArea.getText())) {
                                    JOptionPane.showMessageDialog(null, spotValidateMessage, "Message", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    selNumSpots = Integer.parseInt(spotTextArea.getText());
                                    makeAnimalObject();
                                }
                                break;
                            case "Walrus":
                                selDentalHealth = dentalDropBox.getSelectedItem().toString();
                                makeAnimalObject();
                                break;
                        }
                    }
                }
            }
        });
        add(addEntryButton);

        viewReportButton = new JButton("View Reports");
        viewReportButton.setFont(font);
        viewReportButton.setBounds(650, 210, 150, 25);
        viewReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeClear("View Reports");
                MainFrame.getMainPanel().setVisible(false);
                reportPanel.setVisible(true);
            }
        });
        add(viewReportButton);

        reportPanel = new ReportPanel();
        MainFrame.getContentPanel().add(reportPanel);
        reportPanel.setLayout(null);
        reportPanel.setVisible(false);
    }

    public static JComboBox<String> getAnimalDropBox() {
        return animalDropBox;
    }

    public static ArrayList<GPS> getGpsArrayList() {
        return gpsArrayList;
    }

    public static String getSelSpecies() {
        return selSpecies;
    }

    public static String getSelSex() {
        return selSex;
    }

    public static int getSelWeight() {
        return selWeight;
    }

    public static double getSelBloodPressure() {
        return selBloodPressure;
    }

    public static int getSelNumSpots() {
        return selNumSpots;
    }

    public static String getSelDentalHealth() {
        return selDentalHealth;
    }

    public static String getEntriesReport() {
        return entriesReport;
    }

    public static ReportPanel getReportPanel() {
        return reportPanel;
    }

    // toggle display by selected animal
    public void toggleDisplay(String string) {
        switch (string) {
            case "Penguin":
                bloodLabel.setVisible(true);
                bloodTextArea.setVisible(true);
                spotLabel.setVisible(false);
                spotTextArea.setVisible(false);
                dentalLabel.setVisible(false);
                dentalDropBox.setVisible(false);
                break;
            case "Sea Lion":
                bloodLabel.setVisible(false);
                bloodTextArea.setVisible(false);
                spotLabel.setVisible(true);
                spotTextArea.setVisible(true);
                dentalLabel.setVisible(false);
                dentalDropBox.setVisible(false);
                break;
            case "Walrus":
                bloodLabel.setVisible(false);
                bloodTextArea.setVisible(false);
                spotLabel.setVisible(false);
                spotTextArea.setVisible(false);
                dentalLabel.setVisible(true);
                dentalDropBox.setVisible(true);
                break;
        }
    }

    // make clear when click button
    public void makeClear(String string) {
        switch (string) {
            case "animalDropBox":
                //animalDropBox.setSelectedIndex(0);
                genderDropBox.setSelectedIndex(0);
                dentalDropBox.setSelectedIndex(0);
                weightTextArea.setText("");
                bloodTextArea.setText("");
                spotTextArea.setText("");
                gpsArrayList.clear();
                gpsTextArea.setText("");
                break;
            case "Add Entry":
                //animalDropBox.setSelectedIndex(0);
                //genderDropBox.setSelectedIndex(0);
                dentalDropBox.setSelectedIndex(0);
                weightTextArea.setText("");
                bloodTextArea.setText("");
                spotTextArea.setText("");
                gpsArrayList.clear();
                gpsTextArea.setText("");
                break;
            case "View Reports":
                animalDropBox.setSelectedIndex(0);
                genderDropBox.setSelectedIndex(0);
                dentalDropBox.setSelectedIndex(0);
                weightTextArea.setText("");
                bloodTextArea.setText("");
                spotTextArea.setText("");
                gpsArrayList.clear();
                gpsTextArea.setText("");
                break;
        }
    }

    public void makeAnimalObject() {
        SelAnimal.SelAnimal(selSpecies);
        // add entry data as string
        entriesReport += SelAnimal.getSelAnimal().toString();
        makeClear("Add Entry");
        JOptionPane.showMessageDialog(null, SelAnimal.getSelAnimal().getSpecies() + " saved as new entry.", "Message", JOptionPane.WARNING_MESSAGE);
    }
}
