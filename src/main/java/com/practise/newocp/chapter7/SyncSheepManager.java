package com.practise.newocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncSheepManager {

    public int sheepCount=0;

    private final Object lock = new Object();
    public  void incrementAndReport(){
        synchronized (lock) {
            System.out.println((++sheepCount) + " ");

        }
    }

    public  static void synincrementAndReport(){
        synchronized (SheepManager.class) {
            System.out.println(" Finshed Work");

        }
    }

    public  static synchronized  void synchincrementAndReport(){
            System.out.println(" Finshed Work");

    }


    public  synchronized void synchronizedincrementAndReport(){
        synchronized (lock) {
            System.out.println((++sheepCount) + " ");

        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service= Executors.newFixedThreadPool(10);
            SyncSheepManager sheepManager= new SyncSheepManager();
            for( int i=0;i<10;i++){
               //service.submit(()->sheepManager.incrementAndReport());
               service.submit(()->sheepManager.synchronizedincrementAndReport());
            }

        }finally {
            if(service!= null)
                service.shutdown();
        }

    }
}
