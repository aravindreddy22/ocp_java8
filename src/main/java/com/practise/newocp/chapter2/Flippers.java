package com.practise.newocp.chapter2;

public class Flippers {

    public void flip(){
        System.out.println(" The Fillers flap back and forth");
    }
}

class WebbedFeet{
    public void kick(){
        System.out.println( " The webbed Feet kicked to and fro");
    }
}

class Penguin{

    private Flippers flippers;
    private WebbedFeet webbedFeet;

    public Penguin(){
        this.flippers= new Flippers();
        this.webbedFeet=new WebbedFeet();
    }

    public void flip(){
        flippers.flip();
    }

    public void kick(){
        webbedFeet.kick();
    }

    public static void main(String[] args) {
        Penguin penguin= new Penguin();
        penguin.flip();
        penguin.kick();
    }
}
