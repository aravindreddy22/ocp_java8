package com.practise.newocp.chapter2;

public class AnimalEncapsulation {
    private String species;
    private int age;
    private boolean playing;

    public boolean isPlaying() {
        return playing;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
       if(species==null || species.trim().length()==0)
           throw new IllegalArgumentException(" The Species cannot be null");
        this.species = species;
    }

    public void setAge(int age) {
        if(age<=0)
            throw new IllegalArgumentException(" The Age cannot be negative number and greater than zero");
        this.age = age;
    }

    public AnimalEncapsulation(String species){
        this.setSpecies(species);
    }
}
