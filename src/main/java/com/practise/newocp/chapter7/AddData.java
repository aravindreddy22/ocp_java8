package com.practise.newocp.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AddData {

    public static void main(String[] args) {
        ExecutorService service= null;
        try{
            service= Executors.newSingleThreadExecutor();
            Future<Integer> result= service.submit(()->30+11);
            System.out.println(result.get());
        }catch (Exception ex){

        } finally {
            if(service != null)
                service.shutdown();
        }
    }
}

class waitingForAllServices{

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service= null;
        try{
            service= Executors.newSingleThreadExecutor();
            Runnable task = () -> System.out.println(" I am a good boy");
        }finally {
            if(service != null)
                service.shutdown();
        }

        if(service != null){
            service.awaitTermination(1, TimeUnit.MINUTES);

        }
        if(service.isShutdown())
            System.out.println("All Tasks are finished");
        else
            System.out.println("At least one task is still running");


        ScheduledExecutorService service1= Executors.newSingleThreadScheduledExecutor();
        //ScheduledExecutorService service1= Executors.newSingleThreadScheduledExecutor();

        ExecutorService service2= Executors.newFixedThreadPool(8);

        List<Callable<String>> tasks= new ArrayList<>();
        for(int i=0;i<8;i++)
            tasks.add(()->{
                System.out.println("task" +Thread.currentThread());
                    return "task"+Thread.currentThread();});
        List<Future<String>> results=service2.invokeAll(tasks);
        System.out.println("*********************");
        results.forEach(result ->{
            try{
                System.out.println(result.get());
            }catch(Exception ex){
            }
        });
    }


}

class TestSample{
    public static void main(String[] args) {
        System.out.println(  Runtime.getRuntime().availableProcessors());
    }
}