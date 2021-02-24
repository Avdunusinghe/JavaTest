package com.company;
public class Main {

    public static void main(String[] args) {

       Animal ani[] = new Animal[4];

       ani[0] = new Cat("Tom");
       ani[1] = new Dog("Rex");
       ani[2] = new Cow("root");
       ani[3] = new Cow("no name");


       for (int i = 0; i<4; i++){
           ani[i].song();
       }






    }
}
