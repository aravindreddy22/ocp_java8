package com.practise.newocp.chapter1;

import java.util.ArrayList;

public class ToStringExample {

    public static void main(String[] args) {
       /* System.out.println(new ArrayList<>());
        System.out.println(new String[0].toString());*/

       Elephants elephant= new Elephants();
       elephant.age=10;
       elephant.size=22;
        System.out.println(elephant);
    }
}

class Hippo1{

    private String name;
    private double weight;

    public Hippo1(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    public Hippo1(){
    }

   @Override
    public String toString(){
        return "name : "+ name + "\nweight : "+weight;
      // return ToStringBuilder.reflectionToString(this);
    }


    public static void main(String[] args) {

        Hippo1 hippo1= new Hippo1("Aravind",1000);
        System.out.println(hippo1);
    }
}

class Elephants extends Hippo1{
    int size;
    int age;




}
