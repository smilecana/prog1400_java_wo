package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        Main launcher = new Main();
        System.out.println(launcher.addSomeNumbers(3, 7));
        System.out.println(launcher.addSomeNumbers(3, 7, 10));
        Car toyota = new Car("Toyota", "Rav4");
        System.out.println(toyota);
        */

        // Object z = new Object();

        Animal [] zoo = new Animal[3];

        Animal zebra = new Animal("Zebra", 300, "Savanah", false);
        Animal gorilla = new Animal("Gorilla", 400, "Jungle", true);
        Animal giraffe = new Animal("Giraffe", 250, "Savanah", false);

        zoo[0] = giraffe;
        zoo[1] = gorilla;
        zoo[2] = zebra;

        for (int i = 0; i < zoo.length; i++) {
            Animal animal = zoo[i];
            System.out.println(animal);
            if (animal.isEndangered()) {
                System.out.println(animal.feed("Nice food"));
            } else {
                System.out.println(animal.makeASound());
            }
        }
    }

    public int addSomeNumbers(int a, int b) {
        return a + b;
    }

    public int addSomeNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
