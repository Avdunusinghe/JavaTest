package com.company;

public class Cow extends Animal {

    public Cow(){}
    public Cow(String name){
        super(name);
    }
    public void speak() {
        System.out.println("Moo... Moo...");
    }
}
