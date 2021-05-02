package com.practise.newocp.chapter3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeset {

    static class Rabbit{
        int id;
    }

    public static void main(String[] args) {

        Set<Duck> ducks= new TreeSet<>();
        ducks.add(new Duck("puddless",30));

        Set<Rabbit> rabbits= new TreeSet<>();

//        rabbits.add(new Rabbit());

        Set<Rabbit> rabbits1= new TreeSet<>(new Comparator<Rabbit>() {
            @Override
            public int compare(Rabbit o1, Rabbit o2) {
                return o1.id-o2.id;
            }
        });
    rabbits1.add(new Rabbit());

    }
}
