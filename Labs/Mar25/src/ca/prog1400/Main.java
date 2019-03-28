package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Up-casting
        Animal animal2 = new Peacock(); // Up-casting
        Animal animal3 = new Dog();
        // Here's the actual polymorphism
        animal1.makeSound();
        System.out.println("What class? " + animal1.getClass());
        if (isADog(animal1)) {
            Dog dog1 = (Dog) animal1; // Down-casting
            dog1.eatScoobieSnacks();
        }

        animal2.makeSound();
        if (isADog(animal2)) {
            Dog dog2 = (Dog) animal2; // Down-casting with Exception
            dog2.eatScoobieSnacks();
        }

        animal3.makeSound();
    }

    static boolean isADog(Animal animal) {
        if (animal instanceof Dog) {
            return true;
        } else {
            return false;
        }
    }
}
