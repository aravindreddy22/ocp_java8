package com.practise.newocp.chapter2;

public interface Walk {
    boolean isQuadruped();
    abstract double getMaxSpeed();

    public default void testDefault(){
        System.out.println(" This is the default interface method in the walk Interface");
    }
}

interface Run extends Walk{
    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();

    public default void testDefault(){
        System.out.println(" This is the default interface method in the Run Interface");
    }
}


class Lion implements Run{

    public boolean isQuadruped(){
        return true;
    }

    public boolean canHuntWhileRunning(){
        return true;
    }

    public double getMaxSpeed(){
        return 70;
    }
}

class LionRunnable {
    public static void main(String[] args) {
      Lion lion= new Lion();
       lion.testDefault();



    }
}