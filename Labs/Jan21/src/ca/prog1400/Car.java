package ca.prog1400;

public class Car {
    // 1st option to show current speed
    // public int currentSpeed = 0;
    // 2nd option to show current speed
    int currentSpeed = 0;
    String make;

    public Car(String make) {
        this.make = make;
        // No other code here, apart from class initialization
    }

    public void start() {
        System.out.println("STARTING THE CAR");
    }

    public void accelerateTo(int speed) {
        // Set the speed on this car
        /*
        if (speed > 150) {
            System.out.println("THAT'S ILLEGAL");
            return;
        }
        else if  (speed < 0) {
            System.out.println("Impossible");
            return;
        }
        this.currentSpeed = speed;
        */
        if (speed > 150) {
            System.out.println("THAT'S ILLEGAL");
        }
        else if  (speed < 0) {
            System.out.println("Impossible");
        }
        else {
            this.currentSpeed = speed;
            System.out.println("Vroom Vroom!!!");
        }
    }

    public int getSpeed() {
        return this.currentSpeed;
    }

    /*
    Getter and Setter functions

    getXXXXX <- returns the value
    setXXXXX <- params
     */
    public String setMake(String make) {
        return this.make;
    }

    public String getMake() {
        return this.make;
    }
}
