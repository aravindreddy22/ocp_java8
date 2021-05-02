package com.practise.newocp.chapter2;

import java.util.ArrayList;
import java.util.List;

public final class AnimalImmutableExample {

    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public AnimalImmutableExample(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
       // this.favoriteFoods = favoriteFoods;
    }

    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public int getFavouriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavouriteFood(int index){
        return favoriteFoods.get(index);
    }

}

class AnimalTest{

    public static void main(String[] args) {


        List<String> favList= new ArrayList<String>();
        favList.add("Rice");
        favList.add("Beans");
        AnimalImmutableExample animal = new AnimalImmutableExample("Crow",10, favList);

        System.out.println(animal.getFavouriteFood(0));
        System.out.println(animal.getFavouriteFood(1));

        System.out.println(" After updating the List");

        favList.set(0,"Egg");
        favList.set(1,"Mango");


        System.out.println(animal.getFavouriteFood(0));
        System.out.println(animal.getFavouriteFood(1));

        //Modifying teh Immutable Object is nothing but Creating the new Object with the modified Fields.


    }
}
