package com.practise.newocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    public int sheepCount=0;

    public AtomicInteger asheepCount = new AtomicInteger(0);

    public  void incrementAndReport(){
        System.out.println((++sheepCount)+" ");
    }

    public  void atomicIncrementAndReport(){
        System.out.println((asheepCount.incrementAndGet()));
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service= Executors.newFixedThreadPool(10);
            SheepManager sheepManager= new SheepManager();
            for( int i=0;i<10;i++){
             //   service.submit(()->sheepManager.incrementAndReport());
               service.submit(()->sheepManager.atomicIncrementAndReport());
            }

        }finally {
            if(service!= null)
                service.shutdown();
        }

    }
}
