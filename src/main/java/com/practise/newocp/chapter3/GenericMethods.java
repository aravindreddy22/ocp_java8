package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {


    // Way1 := The formal parameter is must . we need to do that
    public static <T> Crate<T> ship(T t){
        System.out.println(" preparing the crate for : "+t);
        return new Crate<T>();
    }

    //Way2 :=
    public static <T> T ship1(T t){

        return t;
    }

    //way3:
    public static  <T> void sink(T t){

    }


    public static void main(String[] args) {

        // This is the String export
        GenericMethods.ship("packages");
        GenericMethods.<String>ship("packages");
        System.out.println(GenericMethods.<String>ship1("packages"));
        GenericMethods.sink("Preparing");
        GenericMethods.<String>sink("Preparing");

        // This is the elephant Export
        Elephant elephant= new Elephant();
        elephant.name="New One";
        elephant.weight=180;
        GenericMethods.<Elephant>ship(elephant);
        System.out.println(GenericMethods.ship1(elephant).toString());
        GenericMethods.sink(elephant);


    }


    public void legacyAutoboxing(){
        List<Integer> numbers= new ArrayList<>();
        //List numbers= new ArrayList();
        numbers.add(5);
        int num= numbers.get(0);
    }
}

class Dragon{

}

class Unicorn{

}

class LegacyDragons{

    public static void main(String[] args) {
        List unicorns= new ArrayList();
        unicorns.add(new Unicorn());
        new LegacyDragons().printDragons(unicorns);
    }

    public void printDragons(List<Dragon> dragons){
        for (Dragon dragon:dragons) {
            System.out.println(dragon);
        }
    }
}