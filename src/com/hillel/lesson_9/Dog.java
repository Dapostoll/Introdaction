package com.hillel.lesson9;

public class Dog extends Animal {

    public Dog(String name, int age) {
        // call the parent constructor
        super(name, age);
    }

    @Override
    public void getAnimalSound() {
        System.out.println("dog sound : Gav");
    }
}
