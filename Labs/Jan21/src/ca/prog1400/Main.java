package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	    //  Explicit assignment of objects to array.
        Car[] garage = new Car[3];

	    Car honda = new Car("Honda");
	    Car dodge = new Car("Dodge");
	    Car nissan = new Car("Nissan");

//	    garage[0] = honda;
//	    garage[1] = dodge;
//	    garage[2] = nissan;
//

	    // This is the same as the lines above
//	    Car[] garage = {
//                new Car("Honda"),
//                new Car("Dodge"),
//                new Car("Nissan")};

	    // Accessing in the array
        Car todaysRide = garage[2];
        todaysRide.accelerateTo(120);

        // Alternative
        garage[2].accelerateTo(1000);
        garage[1].accelerateTo(-10);

        /*
        for (int i = 0; i < garage.length; i++) {
            Car current = garage[i];
            // How do I get the current speed?
            // 1st option to show current speed
            // System.out.println("Current Car? " + current.currentSpeed);
            // 2nd option to show current speed
            System.out.println("Current Car? " + current.getSpeed());
        }
        */

        for (int i = 0; i < garage.length; i++) {
            Car current = garage[i];
            System.out.println("I picked " + current.getMake());
            current.start();
            current.accelerateTo(100);
        }


    }
}
