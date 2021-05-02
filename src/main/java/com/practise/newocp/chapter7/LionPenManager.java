package com.practise.newocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

    private void removeAnimals(){
        System.out.println(" Removing Animals");
    }

    private void cleanpen(){
        System.out.println("cleaning the pen");
    }

    private void addAnimals(){
        System.out.println("Adding Animals");
    }

    public void performTask(){
        removeAnimals();
        cleanpen();
        addAnimals();
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            service= Executors.newFixedThreadPool(4);
            LionPenManager lionPenManager= new LionPenManager();

            for(int i=0;i<4;i++)
                service.submit(()->lionPenManager.performTask());


        }finally {
            if(service != null)
                service.shutdown();

        }
    }
}
