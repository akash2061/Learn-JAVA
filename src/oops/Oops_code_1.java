package oops;

public class Oops_code_1 {
    public static void main(String[] args) {
        car();
        human();
    }

    static void car() {
        Car c = new Car();
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
    }
}
