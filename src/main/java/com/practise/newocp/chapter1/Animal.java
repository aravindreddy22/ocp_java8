package com.practise.newocp.chapter1;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Animal {
    String name= "????";
    public void printName(){
        System.out.println("Inside teh parent class");
        System.out.println(name);
    }

    public abstract int getWingSpan() throws IOException;
}

class Lion extends Animal{
    String name= "Leo";

    public int getWingSpan() throws FileNotFoundException {
        return 15;
    }

    public void printName(){
        System.out.println("Inside the child class");
        System.out.println(name);
    }
 }

 class PlayWithAnimal {
     public static void main(String[] args) {
         Animal animal= new Lion();
         System.out.println(animal.name);
         animal.printName();

         Lion lion= new Lion();
         lion.printName();
         System.out.println(lion.name);


     }
 }