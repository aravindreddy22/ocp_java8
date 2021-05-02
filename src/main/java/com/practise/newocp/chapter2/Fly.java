package com.practise.newocp.chapter2;

import java.io.IOException;

public interface Fly {
    public int getWingSpan() throws IOException;
    public static final int MAX_SPEED=10;

    //default method in the Interface
    public default void land(){
        System.out.println(" Animal is Landing");
    }

    //static methods := we can call the method without the Instance of the Interface
    public static double calculateSpeed(float distance, double time){
        return distance/time;
    }

}

class Eagle implements Fly{

    public int getWingSpan(){
        return 15;
    }

    public void land(){
        System.out.println(" The Eagle is diving very Fast");
    }

}


class EagleRun{

    public static void main(String[] args) throws Exception {
        Eagle eagle= new Eagle();
        System.out.println(eagle.getWingSpan());
        eagle.land();
        System.out.println(" The Fly calculateSpeed(10,5) :"+Fly.calculateSpeed(10,5));
    }
}