package com.practise.newocp.chapter1.species;

import com.practise.newocp.chapter1.BigCat;


public class Lynx extends BigCat {

    public static void main(String[] args) {

        /** When I create an Object it will call the
         *   class Constructor.
         *   Make a note on Order of Initialization of variables in the Java Class.
         *
         *   we get the fields which are declared as public and allow the access modifier rules
         *
         *   If the variable is static  we can access it directly
         *
          */

        BigCat bigCat= new BigCat();
        System.out.println(bigCat.name);
        System.out.println(name);
        //System.out.println(bigCat.hasPaws);

        // Protected access Modifier Validation with sub class Address Reference with subclass Object.
        Lynx lynx= new Lynx();
        System.out.println(lynx.name);
       // Checking with the protected access Modifiers.
        System.out.println(lynx.hasFur);

        // Protected access Modifier Validation with Super class Address Reference
        BigCat bigCat1= new Lynx();
        System.out.println(bigCat1.name);
        // Checking the protected access Modifiers.
       // System.out.println(bigCat1.hasFur);
    }
}
