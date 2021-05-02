package com.practise.newocp.chapter2;

public class VisitorTicketTracker {

    public static VisitorTicketTracker instance;

    private VisitorTicketTracker(){}

    //Lazy Initialization
    public static VisitorTicketTracker getInstance(){
        if(instance ==null)
            return new VisitorTicketTracker();
        return instance;
    }

    //Creating unique singletons
    public  static synchronized VisitorTicketTracker getInstance1(){
        if(instance ==null)
            return new VisitorTicketTracker();
        return instance;
    }

    //double- checked locking

    public  static  VisitorTicketTracker getInstance2(){
        if(instance ==null) {
            synchronized (VisitorTicketTracker.class){

                if(instance== null)
                    new VisitorTicketTracker();
            }


        }
        return instance;
    }

}

