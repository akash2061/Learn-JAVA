package oops;

public class Oops_code_1 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("\nCar Description:\n" + c);
        System.out.println(c.year);
        System.out.printf("Price : %,.2f\n", c.price);
        System.out.println("\nCalling Car-Functions:\n");
        c.drive();
        c.brake();
    }
}
