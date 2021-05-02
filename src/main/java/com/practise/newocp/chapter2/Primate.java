package com.practise.newocp.chapter2;

public class Primate {
    public int age=100;
    public boolean hasHair(){
        return true;

    }

    public boolean isTailStripped(){
        return false;
    }
}

interface HasTail{
    public static final int age=200;
    public boolean isTailStripped();
}

class Lumer extends Primate implements HasTail{

    public int age=10;

    public boolean isTailStripped(){
        return false;
    }

    public static void main(String[] args) {

        Lumer lumer= new Lumer();
        System.out.println(lumer.age);

        HasTail hasTail= lumer;
        System.out.println(hasTail.isTailStripped());
        System.out.println(hasTail.age);

        Primate primate= lumer;
        System.out.println(primate.hasHair());
        System.out.println(primate.isTailStripped());
        System.out.println(primate.age);
    }
}

