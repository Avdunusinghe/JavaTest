package com.company;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Bow... Bow...");
    }
}
