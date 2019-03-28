package ca.nscc.Classes;

public class ShapeColor {
    private String colorName;
    private int rValue; // Red Value
    private int gValue; // Green Value
    private int bValue; // Blue Value

    public ShapeColor(String colorName, int rValue, int gValue, int bValue) {
        this.colorName = colorName;
        this.rValue = rValue;
        this.gValue = gValue;
        this.bValue = bValue;
    }

    public String getColorName() {
        return colorName;
    }

    public int getrValue() {
        return rValue;
    }

    public int getgValue() {
        return gValue;
    }

    public int getbValue() {
        return bValue;
    }
}
