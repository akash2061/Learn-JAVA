package oops;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza() {
        System.out.println("\nNo Pizza to serve!");
    }

    public String toString() {
        return "\ntoString = Pizza Description:\n" +
                "Bread: " + bread + "\n" +
                "Sauce: " + sauce + "\n" +
                "Cheese: " + cheese + "\n" +
                "Topping: " + topping;
    }
}
