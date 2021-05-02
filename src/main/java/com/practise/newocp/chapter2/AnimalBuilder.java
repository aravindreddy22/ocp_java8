package com.practise.newocp.chapter2;

import java.util.Arrays;
import java.util.List;

public class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favouriteFoods;

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setFavouriteFoods(List<String> favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
        return this;
    }

    public AnimalImmutableExample build(){

        return   new AnimalImmutableExample(species,age,favouriteFoods);
    }


    public static void main(String[] args) {

        AnimalBuilder animalBuilder= new AnimalBuilder();
        animalBuilder.setAge(10).setSpecies("Monkey").setFavouriteFoods(Arrays.asList("Banana","Apple"));

        AnimalImmutableExample animal = animalBuilder.build();

        System.out.println(animal.getFavouriteFoodsCount());
        System.out.println(animal.getFavouriteFood(0));
    }
}
