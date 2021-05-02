package com.practise.newocp.chapter7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierLionPenManager {

    private void removeAnimals(){
        System.out.println(" Removing Animals");
    }

    private void cleanpen(){
        System.out.println("cleaning the pen");
    }

    private void addAnimals(){
        System.out.println("Adding Animals");
    }

    public void performTask(CyclicBarrier c1,CyclicBarrier c2 ) {
        try{
        removeAnimals();
        c1.await();
        cleanpen();
        c2.await();
        addAnimals();
    }catch (InterruptedException | BrokenBarrierException ex) {


        }        }

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service= Executors.newFixedThreadPool(4);
            CyclicBarrierLionPenManager lionPenManager= new CyclicBarrierLionPenManager();

            CyclicBarrier c1= new CyclicBarrier(4);
            CyclicBarrier c2= new CyclicBarrier(4);

            for(int i=0;i<4;i++)
                service.submit(()->lionPenManager.performTask(c1,c2));


        }finally {
            if(service != null)
                service.shutdown();

        }
    }
}
