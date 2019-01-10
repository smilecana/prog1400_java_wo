package ca.prog1400;

import java.util.Scanner;

public class Purchase {
    // Properties or Attributes. The Class State.

    // Constructor
    public Purchase () {
        // No Constructor is OK!
        // Default is no args constructor
    }

    // Behaviour
    public void calculateShipping() {
        String welcomeMessgae = "Welcome Shopper";
        double freeShippingCondition = 50;
        double shippingCost = 10;

        System.out.println(welcomeMessgae);
        System.out.println("============================================");
        System.out.println("Please input your total amount of purchase :");
        Scanner scanner = new Scanner(System.in);
        double inputedAmount = scanner.nextInt();
        System.out.println("");
        if (inputedAmount < freeShippingCondition) {
            inputedAmount += shippingCost;
        }
        System.out.println("Your final costs including shipping costs is : $" + inputedAmount);
    }
}