package com.practise.newocp.chapter2;

import java.util.function.Predicate;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHop;

    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }

}

class FindMatchingAnimal{

    private boolean c=false;
     private static void print(Animal animal, CheckTrait trait){
         System.out.println(trait.test(animal));
         if(trait.test(animal)){
             System.out.println(animal);
         }
     }


    public static void main(String[] args) {
         print(new Animal("fish",false,true),a->a.canSwim());
         print(new Animal("Kangaroo",true,false), a ->a.canHop());

        boolean c= false;
         Predicate<Animal> p1= a->a.canSwim();
         Predicate<Animal> p2= a->{
             return c;
         };

        System.out.println(p2.test(new Animal("pig",false,false)));
        System.out.println("P1 "+p1.test(new Animal("pig",false,false)));

    }
}