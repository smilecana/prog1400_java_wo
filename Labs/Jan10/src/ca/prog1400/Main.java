package ca.prog1400;

import java.awt.Color;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Car player1 = new Car (
                "XYZ123",
                25.0,
                Color.GREEN,
                true
        );
        Car player2 = new Car (
                "123XYZ",
                23.0,
                Color.RED,
                false
        );
        player1.drive();
        player2.drive();

        // Strings
        String str1 = "hello world";
        System.out.println(str1.split(" ")[0]);

        // Arrays
        int [] integers = {1,2,3,4,5};
        String [] strings = {"Hello", "World"};
        boolean [] bools = new boolean[10];
        bools[0] = true;

        System.out.println(integers[3]);
        System.out.println(strings[1]);
        System.out.println(bools[0]);
        System.out.println(bools[9]);
        System.out.println(bools.length);

        // Scanner
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string, please? ");
        String input = scanner.nextLine(); // next is only for next word
        System.out.println("You typed " + input);
        System.out.println("Give me a int, please? ");
        int inputInt = scanner.nextInt();
        System.out.println("You typed " + inputInt);
        */

        // Loops
        char [] chars = {'x', 'y', 'z'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Char " + chars[i]);
        }

    }
}
