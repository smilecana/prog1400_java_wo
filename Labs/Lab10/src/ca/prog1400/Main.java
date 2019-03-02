package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Defer display of JFrame until event queue is ready
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you create and
                    // make your frame visible
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
