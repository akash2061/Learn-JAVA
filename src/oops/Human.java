package oops;

public class Human {
    String name;
    int age;
    double weight;

    // ! Constructors
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating...");
    }

    void drink() {
        System.out.println(this.name + " is drinking...");
    }

    public String toString() {
        return String.format("Name: %12s\nAge: %10d\nWeight: %10.2f\n", this.name, this.age, this.weight);
    }
}
