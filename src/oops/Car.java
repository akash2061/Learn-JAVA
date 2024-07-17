package oops;

public class Car {
    String make = "BMW";
    String model = "M5";
    int year = 2020;
    String color = "Black";
    double price = 17300000.00;

    void drive() {
        System.out.println("You are driving the car");
    }

    void brake() {
        System.out.println("You step on the brake");
    }

    public String toString() {
        String myString = make + "\n" + model + "\n" + color;
        return myString;
    }

    //! Object Passing
    String name;

    Car(String name) {
        this.name = name;
    }
}
