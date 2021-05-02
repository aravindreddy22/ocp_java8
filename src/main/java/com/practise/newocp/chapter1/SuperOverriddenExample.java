package com.practise.newocp.chapter1;

public class SuperOverriddenExample {

    public String name= "Aravind Original";



    protected void findDen(){

        System.out.println("Super Class Method is Executed");
        System.out.println(" ******* superClass ************ "+name);
    }
}

class ChildOverriddenExample extends SuperOverriddenExample{

    public String name= "Aravind2";

    public String testName= "Alpha";
   protected void findDen(){
       System.out.println(" Sub class Method is Executed");
        System.out.println(" ************ SubClass ************* "+name);

    }


    public static void main(String[] args) {


        System.out.println("Super One");
        SuperOverriddenExample overriddenExample= new SuperOverriddenExample();
        overriddenExample.findDen();
        System.out.println(overriddenExample.name);

        System.out.println(" Child Class Object with Child Class Reference");
        ChildOverriddenExample childOverriddenExample= new ChildOverriddenExample();
        childOverriddenExample.findDen();
        System.out.println(childOverriddenExample.name);
        System.out.println(childOverriddenExample.testName);
        System.out.println(childOverriddenExample.testName);

        // Super Class Object Reference
        System.out.println("Child Class Object with Super class Reference");
        SuperOverriddenExample overriddenExample1= new ChildOverriddenExample();
        overriddenExample1.findDen();
        System.out.println(overriddenExample1.name);

    }
}
