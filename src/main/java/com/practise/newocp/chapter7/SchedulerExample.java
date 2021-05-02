package com.practise.newocp.chapter7;

import java.sql.SQLOutput;
import java.time.Month;
import java.util.concurrent.*;

public class SchedulerExample {

    public static void main(String[] args) {
        ScheduledExecutorService service = null;
        try{
            service= Executors.newSingleThreadScheduledExecutor();
            Runnable task1= () -> System.out.println(" Hello Monkey");
            Callable<String> task2= () -> "Monkey";

            Future<?> result1= service.schedule(task1,10, TimeUnit.SECONDS);
            Future<?> result2= service.schedule(task2,8, TimeUnit.SECONDS);
            System.out.println(result2.get());
            System.out.println(" The number of processprs available :"+Runtime.getRuntime().availableProcessors());
        } catch (Exception ex){
            System.out.println("**********************");
        }finally {
            if(service!= null)
                service.shutdown();
        }

    }
}
