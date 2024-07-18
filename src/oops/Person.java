package oops;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        String s = "\nName:   " + name + "\nAge:    " + age;
        return s;
    }
}
