package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCards {

    public static void main(String[] args) {

        List<String> strings= new ArrayList<>();
        strings.add(" Hello World");
        new UnboundedWildCards().printList(strings); // List<String> can't be assign to the List<Object>.

      //  List<Object> l = new ArrayList<String>();


        /**
         * This is an upper bound example honey
         *
         * we can't directly assign the subclassess of the objects
         */

       // List<Number> number= new ArrayList<Integer>(); // how do we fix this

        List<? extends Number> number= new ArrayList<Integer>(); // how do we fix this
        List<? super Integer> number1= new ArrayList<Number>(); // how do we fix this
        List<? super Integer> number2= new ArrayList<>(); // how do we fix this

    }


    public void printList(List<?> list){

    //  list.add("apple");

        for( Object obj:list){
            System.out.println(list);
        }
    }
}
