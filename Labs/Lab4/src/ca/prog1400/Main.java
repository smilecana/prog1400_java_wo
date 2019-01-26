package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Food[] picnicBasket = {
                new Food("Hamburger", "Meat"),
                new Food("Apple", "Fruit"),
                new Food("Broccoli", "Vegetable")
        };

        for (int i = 0; i < picnicBasket.length; i++) {
            Food currentFood = picnicBasket[i];
            if (currentFood.getType() == "Vegetable") {
                System.out.println(currentFood.denyIt());
            }
            else {
                System.out.println(currentFood.eatIt());
            }
        }
    }
}
