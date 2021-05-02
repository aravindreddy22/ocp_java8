package com.practise.newocp.chapter7;

import java.util.concurrent.*;

public class CheckResults{

    public static int counter=0;
    public static void main(String[] args) throws InterruptedException{

        Runnable runnable= ()->{
          for( int i=0;i<500 ;i++)
              counter++;
          try{
              Thread.sleep(1000000000);
          }catch (Exception e){
              e.printStackTrace();
          }
        };
        new Thread(runnable).start();
        while(counter<100) {
            System.out.println(" Not reached Yet");
        }
        System.out.println(" Reached");

    }
}


class CheckResultsSubmit{
    public static int counter=0;
    public static void main(String[] args) {

        ExecutorService service= null;

        try{
            service= Executors.newSingleThreadExecutor();
            Future<?> result= service.submit(()-> {
                for(int i=0;i<500;i++)
                    counter++;
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println(" Reached");

        } catch(Exception ex){

        } finally {
            if(service != null)
                service.shutdown();
        }
    }
}