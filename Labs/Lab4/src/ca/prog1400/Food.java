package ca.prog1400;

public class Food {
    String foodName;
    String foodType;

    public Food(String inputFoodName, String inputFoodType) {
        this.foodName = inputFoodName;
        this.foodType = inputFoodType;
    }

    /*
    public void eatIt() {
        System.out.println("You just ate the " + this.foodName);
    }

    public void denyIt() {
        System.out.println("Not eating that! I hate " + this.foodType + "!");
    }
    */

    public String eatIt() {
        return "You just ate the " + this.foodName;
    }

    public String denyIt() {
        return "Not eating that! I hate " + this.foodType + "!";
    }

    public String getType() {
        return this.foodType;
    }
}
