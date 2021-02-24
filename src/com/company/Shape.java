package com.company;

public class Shape {

    protected String name;

    public Shape(){

        this.name = "";
        System.out.println("Shape Class defulte constructor Called");
    }
    public Shape(String name){

        this.name = name;
        System.out.println("Shape Class overload  constructor Called");
    }
}
