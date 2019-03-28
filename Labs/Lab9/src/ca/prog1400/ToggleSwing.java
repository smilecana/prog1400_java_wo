package ca.prog1400;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleSwing extends JFrame {

    public ToggleSwing() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Take A Swing!");

        //Create, size and position left panel (blue)
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(300, 200);
        leftPanel.setLocation(0, 50);
        leftPanel.setBackground(Color.BLUE);

        //Create, size and position right panel (blue)
        JPanel rightPanel = new JPanel();
        rightPanel.setSize(300, 200);
        rightPanel.setLocation(300, 50);
        rightPanel.setBackground(Color.RED);

        //Create, size and position left label (red text)
        JLabel leftLabel = new JLabel("This is the left panel");
        leftLabel.setBounds(50, 50, 200, 30);
        leftLabel.setFont(new Font("Arial", Font.BOLD, 24));
        leftLabel.setForeground(Color.RED);

        //Create, size and position right label (blue text)
        JLabel rightLabel = new JLabel("This is the right panel");
        rightLabel.setBounds(50, 50, 200, 30);
        rightLabel.setFont(new Font("Arial", Font.BOLD, 24));
        rightLabel.setForeground(Color.BLUE);

        //Add each label to their respective panels
        leftPanel.add(leftLabel);
        rightPanel.add(rightLabel);

        // Create, size and position left button
        JButton leftButton = new JButton("Toggle Left");
        leftButton.setBounds(75, 0, 150, 50);

        // Create, size and position right button
        JButton rightButton = new JButton("Toggle Left");
        rightButton.setBounds(375, 0, 150, 50);

        add(leftButton);
        add(rightButton);
        add(leftPanel);
        add(rightPanel);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftPanel.setVisible(!leftPanel.isVisible());
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightPanel.setVisible(!rightPanel.isVisible());
            }
        });

        setSize(600, 250);
        setLayout(null);
        setVisible(true);
    }

}








/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ToggleSwing extends JFrame{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JPanel panelOne;
    private JPanel panelTwo;

    public ToggleSwing() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Take A Swing!");
        JPanel pane = new JPanel();
        setContentPane(pane);

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

//        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.CENTER;
        }

        JButton buttonOne = new JButton("Toggle Left");
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 70;
        c.ipady = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(buttonOne, c);

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelOne.setVisible(!panelOne.isVisible());
            }
        });

        JButton buttonTwo = new JButton("Toggle Right");
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 70;
        c.ipady = 30;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(buttonTwo, c);

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch the panels...
                panelTwo.setVisible(!panelTwo.isVisible());
            }
        });

        panelOne = new JPanel();
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 50;
        c.ipady = 140;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        //panelOne.setSize(160, 180);
        panelOne.setBackground(Color.BLUE);
        pane.add(panelOne, c);

        JLabel labelOne = new JLabel();
        labelOne.setText("This is the left panel");
        labelOne.setForeground(Color.RED);
        labelOne.setFont (labelOne.getFont ().deriveFont (32.0f));
        panelOne.add(labelOne);

        panelTwo = new JPanel();
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 50;
        c.ipady = 140;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        //panelTwo.setSize(160, 180);
        panelTwo.setBackground(Color.RED);
        pane.add(panelTwo, c);

        JLabel labelTwo = new JLabel();
        labelTwo.setText("This is the right panel");
        labelTwo.setForeground(Color.BLUE);
        labelTwo.setFont (labelTwo.getFont ().deriveFont (32.0f));
        panelTwo.add(labelTwo);

//        button = new JButton("5");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.ipady = 0;       //reset to default
//        //c.weighty = 1.0;   //request any extra vertical space
//        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        c.insets = new Insets(10,0,0,0);  //top padding
//        c.gridx = 1;       //aligned with button 2
//        c.gridwidth = 2;   //2 columns wide
//        c.gridy = 2;       //third row
//        pane.add(button, c);
    }
*/
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
//    public static void createAndShowGUI() {
//        //Create and set up the window.
//        JFrame frame = new JFrame("Take A Swing!");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Set up the content pane.
//        ToggleSwing(frame.getContentPane());
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
//}





    /*
    public ToggleSwing(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        //setLayout(new BorderLayout());
        //setVisible(true);
        setTitle("Take A Swing!");



        JPanel container = new JPanel();
        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton buttonOne = new JButton();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
//        buttonOne.setText("Toggle Left");
//        buttonOne.setSize(200, 100);
        container.add(buttonOne);

        JButton buttonTwo = new JButton();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 0;
//        buttonTwo.setText("Toggle Right");
//        buttonTwo.setSize(200, 100);
        container.add(buttonTwo);

        JPanel panelOne = new JPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        //panelOne.add(new JLabel("This is the left Panel"));
        container.add(panelOne);

        JPanel panelTwo = new JPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 3;
        //panelTwo.add(new JLabel("This is the right Panel"));
        container.add(panelTwo);

        //container.setLayout(new GridLayout(4,8));





        this.add(container);
    }
    */
