package com.practise.newocp.chapter3;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();
        set.add(66);
        set.add(8);
        set.add(10);
        set.forEach(System.out::println);

        Set<Integer> tset= new TreeSet<>(set);
        System.out.println(" *** TREE SET****");
        tset.forEach(System.out::println);


        //Navigable Set

        NavigableSet<Integer> nset= new TreeSet<>();

        for(int i=0;i<10;i++) {

          if(i!=4)
          {
              nset.add(i);
              nset.add(i+10);
          }

        }

        nset.forEach(System.out::println);
        System.out.println(" *** NavigableSet example ******");
        System.out.println(nset.lower(15)); // Returns the highest element and which is less than 15
        System.out.println(nset.floor(14)); //Returns the highest element which is no higher than 14
        System.out.println(nset.ceiling(6)); // returns lowest element greater than or equals to 6
        System.out.println(nset.higher(15)); // returns lowest element greater than 15

    }
}
