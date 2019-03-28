package ca.nscc.GUI;

import javax.swing.*;
import java.awt.*;

public abstract class PanelBase extends JPanel {
    // Common font for all panels.
    protected Font myFont;

    public PanelBase() {
        this.myFont = new Font("Calibri", Font.BOLD, 24);
        setLayout(null);
    }
}
