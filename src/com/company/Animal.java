package com.company;

public class Animal {
    protected String name;

    public Animal(){
        this.name = "";
    }
    public Animal(String name){
        this.name = name;
    }
    public void speak(){};
    public void song(){
        System.out.println(name+ "'s Song");
        speak();
        System.out.println("la la la");
        speak();
        System.out.println("la la la");
        speak();
        System.out.println("======================================");
    }

}
