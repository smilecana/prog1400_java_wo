package ca.prog1400;

public class Car {
    public static int carCount;

    private String model;
    private int currentSpeed;

    // Constructor
    public Car(String model) {
        this.model = model;
        Car.carCount++;
    }

    // Static function to set car count
    public static void setCarCount(int count) {
        carCount = count;
    }

    public static int getCarCount() {
        return Car.carCount;
    }

    // Get the current speed
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Set the current speed
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
