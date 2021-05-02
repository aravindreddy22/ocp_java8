package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Duck  implements Comparable<Duck>{

    public String name;
    public int weight;

    public int compareTo(Duck duck){
        return this.name.compareTo(duck.name); // This is going to call the compareTo method in the String.
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight=weight;
    }

    public String toString(){

        return this.name + " "+this.weight;

    }
}

class DuckExample{

    public static void main(String[] args) {

        List<Duck> dlist= new ArrayList<>();
        Duck d1= new Duck("Aravind",100);
        Duck d2= new Duck("aravind",120);
        Duck d3= new Duck("am",140);

        dlist.add(d1);
        dlist.add(d2);
        dlist.add(d3);
        Collections.sort(dlist);
        d1.equals(d2); // Just check the address references


        //1.numbers
        //2.Upper case
        //3. Lower Case.

        System.out.println(dlist);
        dlist.forEach(System.out::println);


        //Collections.sort(dlist,(a,b)->a.weight - b.weight);

        //comparator
        Comparator<Duck> duckbyweight= new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.weight-o2.weight;
            }
        };

        Collections.sort(dlist,duckbyweight);
        System.out.println(dlist);
    }
}