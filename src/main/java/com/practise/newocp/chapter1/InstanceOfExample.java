package com.practise.newocp.chapter1;

public class InstanceOfExample {


    public static void main(String[] args) {

        HeavyAnimal hippo= new Hippo();
        Elephant elephant= new Elephant();
        HeavyAnimal heavyAnimal= new HeavyAnimal();

        System.out.println(hippo instanceof HeavyAnimal);
        System.out.println(hippo instanceof Hippo);
        System.out.println(elephant instanceof HeavyAnimal);
        System.out.println(hippo instanceof Elephant);

        /**
         * Checking null and Object references
         */

        System.out.println("Chekcking Instance of Object:");
        System.out.println(hippo instanceof Object);
        Hippo nullhippo= null;
        System.out.println(" Checking Instance of null: ");
        System.out.println(nullhippo instanceof Object);

        /**
         * Interface validation
         *
         */

        System.out.println("Interface check");
        System.out.println(hippo instanceof Mother);

        System.out.println(heavyAnimal instanceof Mother);
    }
}

class HeavyAnimal implements Mother{}

class Hippo extends HeavyAnimal {

}

class Elephant extends HeavyAnimal{

}


