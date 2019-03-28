package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.ShapeColor;
import ca.nscc.Classes.Triangle;
import ca.nscc.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoosePanel extends PanelBase {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private JLabel dimensionsLabel;
    private JLabel imageLabel;
    private JTextField nameText;
    // Shape Radio Button
    private JRadioButton rdoCircle;
    private JRadioButton rdoRectangle;
    private JRadioButton rdoTriangle;
    // Color Radio Button
    private JRadioButton rdoRed;
    private JRadioButton rdoGreen;
    private JRadioButton rdoBlue;

    private JButton displayBtn;

    private Circle circle = null;
    private Rectangle rect = null;
    private Triangle triangle = null;

    public ChoosePanel() {
//
//        //Set font object
//        Font myFont = new Font("Calibri", Font.BOLD, 24);

        //Set Panel Properties
//        setLayout(null); // Absolute positioning
        super();

        setVisible(true);

        //Create all GUI objects
        addShapeRadios();
        addColorRadios();

        //Label control for name
        JLabel nameLabel = new JLabel("Name your shape:");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 10, 200, 50);

        //Textfield control for name
        nameText = new JTextField();
        nameText.setFont(myFont);
        nameText.setBounds(260, 10, 200, 50);

        //Labels to show dimensions of each shape in a single field
        dimensionsLabel = new JLabel("DIMENSION LABEL");
        dimensionsLabel.setFont(myFont);
        dimensionsLabel.setBounds(260, 70, 300, 50);

        //Label for shape image
        imageLabel = new JLabel();
        imageLabel.setBounds(500, 70, 150, 150);

        //Change screen button
        displayBtn = new JButton("Display Selected");
        displayBtn.setFont(myFont);
        displayBtn.setBounds(500, 220, 200, 50);

        //Add all controls to Panel
        add(rdoCircle);
        add(rdoRectangle);
        add(rdoTriangle);
        add(nameLabel);
        add(nameText);
        add(imageLabel);
        add(dimensionsLabel);
        add(displayBtn);
        add(rdoRed);
        add(rdoGreen);
        add(rdoBlue);
        add(displayBtn);
    }

    private void addColorRadios() {
        // Red radio
        int redIndex = 0;
        ShapeColor color = MainFrame.getColors().get(redIndex);

        rdoRed = new JRadioButton(color.getColorName());
        rdoRed.setBackground(new Color(
                color.getrValue(),
                color.getgValue(),
                color.getbValue()));
        rdoRed.setFont(myFont);
        rdoRed.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(0);
                createShape();
            }
        });

        // Green radio
        int greenIndex = 1;
        color = MainFrame.getColors().get(greenIndex);

        rdoGreen = new JRadioButton(color.getColorName());
        rdoGreen.setBackground(new Color(
                color.getrValue(),
                color.getgValue(),
                color.getbValue()));
        rdoGreen.setFont(myFont);
        rdoGreen.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(1);
            }
        });

        // Blue radio
        int blueIndex = 2;
        color = MainFrame.getColors().get(blueIndex);

        rdoBlue = new JRadioButton(color.getColorName());
        rdoBlue.setBackground(new Color(
                color.getrValue(),
                color.getgValue(),
                color.getbValue()));
        rdoBlue.setFont(myFont);
        rdoBlue.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MainFrame.setSelectedColor(2);
            }
        });

        rdoRed.setBounds(50, 270, 150, 50);
        rdoGreen.setBounds(50, 320, 150, 50);
        rdoBlue.setBounds(50, 370, 150, 50);

        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoRed);
        grpColorRadios.add(rdoGreen);
        grpColorRadios.add(rdoBlue);

        // Label to tell user to pick the colour
        JLabel nameLabel = new JLabel("Pick the shape's color: ");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 220, 300, 50);
        add(nameLabel);
    }

    private void createShape() {
        String name = nameText.getText();
        if (rdoCircle.isSelected()) {
            // Set up the circle
            circle = MainFrame.getTheCircle();
            circle.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            circle.setName(name);
        } else if (rdoTriangle.isSelected()) {
            // Set up the triangle
            triangle = MainFrame.getTheTriangle();
            triangle.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            triangle.setName(name);
        } else if (rdoRectangle.isSelected()) {
            // Set up the rectangle
            rect = MainFrame.getTheRectangle();
            rect.setColor(MainFrame.getColors().get(MainFrame.getSelectedColor()));
            rect.setName(name);
        }
    }

    private void swapImages(ImageIcon newImage) {
        // change the image
        imageLabel.setIcon(newImage);

    }

    private void addShapeRadios() {
        rdoCircle = new JRadioButton("Circle");
        rdoCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle circle = MainFrame.getTheCircle();
                dimensionsLabel.setText(circle.getDimensionsString());
                swapImages(circle.getCirclePic());
                // Load an image
            }
        });
        rdoCircle.setFont(myFont);

        rdoRectangle = new JRadioButton("Rectangle");
        rdoRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rectangle rect = MainFrame.getTheRectangle();
                dimensionsLabel.setText(rect.getDimensionsString());
                swapImages(rect.getRectanglePic());
            }
        });
        rdoRectangle.setFont(myFont);

        rdoTriangle = new JRadioButton("Triangle");
        rdoTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangle triangle = MainFrame.getTheTriangle();
                dimensionsLabel.setText(triangle.getDimensionsString());
                swapImages(triangle.getTrianglePic());
            }
        });
        rdoTriangle.setFont(myFont);


        rdoCircle.setBounds(50, 70, 150, 50);
        rdoRectangle.setBounds(50, 120, 150, 50);
        rdoTriangle.setBounds(50, 170, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoCircle);
        grpColorRadios.add(rdoRectangle);
        grpColorRadios.add(rdoTriangle);
    }

    public JButton getDisplayBtn() {
        return displayBtn;
    }
}
