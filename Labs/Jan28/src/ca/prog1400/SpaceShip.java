package ca.prog1400;

public class SpaceShip {
    private int fuelLevel;
    private double o2Level;
    private String name;

    public SpaceShip(int fuelLevel, double o2Level, String name) {
        this.fuelLevel = fuelLevel;
        // I could check that o2level is greater than 10%
        this.o2Level = o2Level;
        this.name = name;
    }

    private boolean checkLaunchReady() {
        if (this.fuelLevel <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void launch() {
        if (checkLaunchReady()) {
            System.out.println("We have lift off!!!");
        } else {
            System.out.println("No");
        }

    }

    public String telemetry() {
        return String.format("Houston, report from %s: \nfuel: %d\nO2: %.3f", this.name, this.fuelLevel, this.o2Level);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getO2Level() {
        return o2Level;
    }

    public void setO2Level(double o2Level) {
        this.o2Level = o2Level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
