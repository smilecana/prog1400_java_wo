package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.ShapeColor;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class MainFrame extends JFrame {

    private static Circle theCircle;
    private static Rectangle theRectangle;
    private static Triangle theTriangle;
    private static ArrayList<ShapeColor> colors = new ArrayList<>();
    private static int selectedColor = 0;

    public MainFrame() {    //Constructor

        // Create list of color objects
        ShapeColor redColor = new ShapeColor("Red",255,0,0);
        ShapeColor greenColor = new ShapeColor("Green",0,255,0);
        ShapeColor blueColor = new ShapeColor("Blue",0,0,255);

        colors.add(redColor);
        colors.add(greenColor);
        colors.add(blueColor);

        // Create "default" shape objects
        Random random = new Random();
        int radius = random.nextInt(100);
        theCircle = new Circle(null,radius);
        int length = random.nextInt(100);
        int width = random.nextInt(100);
        theRectangle = new Rectangle(null, length, width);
        int base = random.nextInt(100);
        int height = random.nextInt(100);
        theTriangle = new Triangle(null, base, height);

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        add(chooseScreen);
        add(displayScreen);
        // Access the choose panel button and add the listener here
        JButton displayButton = chooseScreen.getDisplayBtn();
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
                displayScreen.displayChoice();
            }
        });
    }

    public static Circle getTheCircle() {
        return theCircle;
    }

    public static void setTheCircle(Circle theCircle) {
        MainFrame.theCircle = theCircle;
    }

    public static Rectangle getTheRectangle() {
        return theRectangle;
    }

    public static void setTheRectangle(Rectangle theRectangle) {
        MainFrame.theRectangle = theRectangle;
    }

    public static Triangle getTheTriangle() {
        return theTriangle;
    }

    public static void setTheTriangle(Triangle theTriangle) {
        MainFrame.theTriangle = theTriangle;
    }

    public static ArrayList<ShapeColor> getColors() {
        return MainFrame.colors;
    }

    public static void setColors(ArrayList<ShapeColor> colors) {
        MainFrame.colors = colors;
    }

    public static int getSelectedColor() {
        return selectedColor;
    }

    public static void setSelectedColor(int selectedColor) {
        MainFrame.selectedColor = selectedColor;
    }
}
