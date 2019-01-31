package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        SpaceShip spaceX = new SpaceShip(1000, 89.9, "Dragon");
        spaceX.launch();
        System.out.println("Report? " + spaceX.telemetry());
    }
}
