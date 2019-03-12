package ca.prog1400;

import ca.prog1400.ui.GameFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you create and
                    // make your frame visible
                    GameFrame frame = new GameFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
