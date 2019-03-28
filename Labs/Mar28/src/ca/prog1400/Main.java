package ca.prog1400;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Car honda = new Car();
        Insurable x = (Insurable) honda;
        System.out.println(Insurable.TOP_RATE);
    }
}
