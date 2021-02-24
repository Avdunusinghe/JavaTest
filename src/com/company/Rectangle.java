package com.company;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(){

        //super();

        this.length =0;
        this.width = 0;
        System.out.println(" Rectangle Class defulte constructor Called");
    }
    public Rectangle(String name, int length, int width){

        //super(name);

        this.length = length;
        this.width = width;
        System.out.println(" Rectangle Class overload constructor Called");
    }

}
