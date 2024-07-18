package oops;

public class Dog extends Animal {
    @Override
    void speak() { // ! Override speak
        System.out.println("Dog is Barking...");
    }
}
