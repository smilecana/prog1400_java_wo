package ca.prog1400;

import ca.prog1400.ui.DemoUI;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
//        DemoUI frame = new DemoUI();
//        frame.setVisible(true);

        // Defer display of JFrame until event queue is ready
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you create and
                    // make your frame visible
                    DemoUI frame = new DemoUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
