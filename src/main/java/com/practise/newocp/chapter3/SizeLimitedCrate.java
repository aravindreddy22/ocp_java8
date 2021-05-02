package com.practise.newocp.chapter3;

public class SizeLimitedCrate <T,U>{


    public T contents;
    public U sizeLimits;

    public SizeLimitedCrate(T contents, U sizeLimits) {
        this.contents = contents;
        this.sizeLimits = sizeLimits;
    }


    public U getSize(){
        return this.sizeLimits;
    }

    public T getContents(){
        return this.contents;
    }
    public static void main(String[] args) {

        Elephant elephant= new Elephant();
        elephant.name= "BIG ONE";
        elephant.weight= 123;
        Integer sizeLimit=15_000;

        SizeLimitedCrate<Elephant,Integer> c1= new SizeLimitedCrate<>(elephant,sizeLimit);

        System.out.println(" The get size is :"+c1.getContents());
        System.out.println(" The get size is :"+c1.getSize());

    }


}

