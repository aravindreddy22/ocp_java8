package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Squirrel {

    private int weight;
    private String Species;

    public Squirrel(String species) {
        Species = species;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return Species;
    }

    public Squirrel setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "weight=" + weight +
                ", Species='" + Species + '\'' +
                '}';
    }
}

class MultiFieldComparator implements Comparator<Squirrel>{

    public int compare(Squirrel s1, Squirrel s2){
        int result= s1.getSpecies().compareToIgnoreCase(s2.getSpecies());

        if(result!=0)
            return result;

        return s1.getWeight()-s2.getWeight();

    }

    public static void main(String[] args) {
        List<Squirrel> squirrels= new ArrayList<>();
        squirrels.add(new Squirrel("Apple").setWeight(12));
        squirrels.add(new Squirrel("Mango").setWeight(13));
        squirrels.add(new Squirrel("Banana").setWeight(18));
        squirrels.add(new Squirrel("Grapes").setWeight(1));

        //Collections.sort(squirrels,new MultiFieldComparator());


        Collections.sort(squirrels,new ChainingComparator());

        System.out.println(squirrels);
    }


}

class ChainingComparator implements Comparator<Squirrel>{

    public int compare(Squirrel s1,Squirrel s2){
        Comparator<Squirrel> c= Comparator.comparing(s->s.getSpecies());
        c=c.thenComparing(s->s.getWeight());
        return c.compare(s1,s2);
    }
}