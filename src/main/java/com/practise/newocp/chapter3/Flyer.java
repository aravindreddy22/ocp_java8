package com.practise.newocp.chapter3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Flyer {

    void fly();
}


class HangGliders implements Flyer{

    public void fly(){
        System.out.println( " HangGliders are flying");
    }
}

class Goose implements Flyer{

    public void fly(){
        System.out.println(" The Goose is flyig");
    }
}

class UpperBoundWildCards{

    public static void main(String[] args) {

        UpperBoundWildCards upperBoundWildCards = new UpperBoundWildCards();

        //Secnario1:
        List<Flyer> nlist= new ArrayList<>();
        upperBoundWildCards.anyFlyer(nlist);
        upperBoundWildCards.groupOfFlyers(nlist);

        //Secnario2:
        List<Goose> geese= new ArrayList<>();
        upperBoundWildCards.groupOfFlyers(geese);
       //new UpperBoundWildCards().anyFlyer(geese); // compilation error



        //Secnario3:
        List<HangGliders> hangGliders= new ArrayList<>();
        upperBoundWildCards.groupOfFlyers(hangGliders);
        //new UpperBoundWildCards().anyFlyer(hangGliders); // compilation error


        //Secnario4:
        List<Object> object= new ArrayList<>();
       //  new UpperBoundWildCards().groupOfFlyers(object); //doesn't work here


        List<String> slist= new ArrayList<String>();
        slist.add("monkey");

        List<Object> olist= new ArrayList<Object>(slist);
         addSound(slist);
        //addSound(olist);

        // Lower bound validation
        System.out.println(" ****** Lower Bound **********");
        addSoundsLower(slist);
        addSoundsLower(olist);


        List<? super IOException> exceptions= new ArrayList<Exception>();

        exceptions.add(new IOException());


    }


    private void anyFlyer(List<Flyer> flyer){

        System.out.println(" Any fler is called successfully");

    }




    private void groupOfFlyers(List<? extends Flyer> flyers){

        System.out.println(" The groupOf Flyers is called successfully");
    }

    public static void addSound(List<? extends Object> list){
        Object o= "Aravind";

       // list.add(o);

        System.out.println(" This is the valid bounded type");
    }

    // Lower Bound Example
    public static void addSoundsLower(List<? super String> list){
        list.add("Lower bound honey");

        System.out.println(" Lower bound Executed successfully .....");
    }
}
