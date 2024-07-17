package oops;

public class Oops {

    static void car() {
        Car c = new Car("BMW");
        System.out.println("\nCar Description:\n" + c);
        System.out.println(c.year);
        System.out.printf("Price : %,.2f\n", c.price);
        System.out.println("\nCalling Car-Functions:\n");
        c.drive();
        c.brake();
    }

    static void human() {
        Human h = new Human("Morningstar", 20, 65);
        System.out.println("\nHuman Description:\n");
        System.out.printf("Name: %18s\n", h.name);
        System.out.printf("Age: %10d\n", h.age);
        System.out.printf("Weight: %10.2f\n", h.weight);
        h.eat();
        System.out.println();
        Human h1 = new Human("Vincent", 27, 78);
        System.out.printf("Name: %14s\n", h1.name);
        System.out.printf("Age: %10d\n", h1.age);
        System.out.printf("Weight: %10.2f\n", h1.weight);
        h1.drink();
        System.out.println();
        Human human = new Human(null, 0, 0);
        System.out.println(human);
    }

    static void diceRoller() {
        new DiceRoller();
    }

    static void pizza() {
        System.out.println("\nHere are the Ingredient of the pizza:");
        Pizza pizza = new Pizza("Thin Crust", "Tomato Sauce", "Mozzarella", "Paneer");
        System.out.printf("Bread:   \t%s\n", pizza.bread);
        System.out.printf("Sauce:   \t%s\n", pizza.sauce);
        System.out.printf("Cheese:  \t%s\n", pizza.cheese);
        System.out.printf("Topping: \t%s\n", pizza.topping);

        System.out.println("\nHere are the Ingredient of the second pizza:");
        Pizza pizza1 = new Pizza("Thick Crust", "Garlic Sauce", "Cheddar");
        System.out.printf("Bread:   \t%s\n", pizza1.bread);
        System.out.printf("Sauce:   \t%s\n", pizza1.sauce);
        System.out.printf("Cheese:  \t%s\n", pizza1.cheese);
        System.out.printf("Topping: \t%s\n", pizza1.topping);

        System.out.println("\nHere are the Ingredient of the third pizza:");
        Pizza pizza2 = new Pizza("Thick Crust", "Garlic Sauce");
        System.out.printf("Bread:   \t%s\n", pizza2.bread);
        System.out.printf("Sauce:   \t%s\n", pizza2.sauce);
        System.out.printf("Cheese:  \t%s\n", pizza2.cheese);
        System.out.printf("Topping: \t%s\n", pizza2.topping);

        System.out.println("\nHere are the Ingredient of the forth pizza:");
        Pizza pizza3 = new Pizza("Thick Crust");
        System.out.printf("Bread:   \t%s\n", pizza3.bread);
        System.out.printf("Sauce:   \t%s\n", pizza3.sauce);
        System.out.printf("Cheese:  \t%s\n", pizza3.cheese);
        System.out.printf("Topping: \t%s\n", pizza3.topping);

        System.out.println("\nHere are the Ingredient of the fifth pizza:");
        Pizza pizza4 = new Pizza();
        System.out.printf("Bread:   \t%s\n", pizza4.bread);
        System.out.printf("Sauce:   \t%s\n", pizza4.sauce);
        System.out.printf("Cheese:  \t%s\n", pizza4.cheese);
        System.out.printf("Topping: \t%s\n", pizza4.topping);

        System.out.println(pizza);
    }

    static void foods() {
        System.out.println("\nArray Object = Resources in refrigerator:");
        // Food[] refrigerator = new Food[3]; // ! Method 1
        Food food1 = new Food("Tomato");
        Food food2 = new Food("Onion");
        Food food3 = new Food("Bread");
        Food food4 = new Food("Tomato Sauce");
        Food food5 = new Food("Ginger garlic paste");
        Food food6 = new Food("Olive Oil");

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        Food[] refrigerator = { food1, food2, food3, food4, food5, food6 }; // ! Method 2
        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(i + "\t:\t" + refrigerator[i].name);
        }
    }

    static void garage() {
        Garage g = new Garage();
        Car c = new Car("Porsche 911");
        g.park(c);
    }

    static void friend() {
        System.out.println("\nNumber of Friends: " + Friend.numOffriends);
        new Friend("John Libert");
        new Friend("Vincent");
        new Friend("Valerie");
        Friend.displayTotalFriends(); // ! Static methods
    }

    public static void main(String[] args) {
        car(); // ! oops
        human(); // ! Constructors
        diceRoller(); // ! Local & global variables
        pizza();// ! Overloaded Constructors
        foods(); // ! Array Objects
        garage(); // ! Object Passing
        friend(); // ! Static variables
    }
}
