package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        Astronaut a1 = new Astronaut(
                "Major Tom", 150, 60.0);
        Astronaut a2 = new Astronaut(
                "Buzz", 200, 90.0);
        Astronaut a3 = new Astronaut(
                "Yuri Gagarin", 175, 10);

        // Declare an empty array of fixed width
        /*
        Astronaut [] astronauts = new Astronaut[3];
        astronauts[0] = a1;
        astronauts[1] = a2;
        astronauts[2] = a3;
        */

        // Declare an array with local instances
        Astronaut [] astronauts = {a1, a2, a3};

        for (int i = 0; i < astronauts.length; i++) {
            Astronaut astronaut = astronauts[i];
            double oxygen = astronaut.groundControlToMajorTom();
            System.out.println(
                    String.format("Astronaut %d O2 level = %.2f%%", i + 1, oxygen));
        }
    }

}
