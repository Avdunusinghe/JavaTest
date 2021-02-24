package com.company;

public class Cat extends Animal{

    public Cat(){}
    public Cat(String name){
        super(name);
    }
    public void speak(){

        System.out.println("Meow... Meow...");
    }
}
