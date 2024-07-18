package oops;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age); // ! Send data to super class of constructore [Person]
        // this.name = name;
        // this.age = age;
        this.power = power;
    }

    public String toString() {
        return super.toString() + "\nPowers: " + this.power;
    }
}
