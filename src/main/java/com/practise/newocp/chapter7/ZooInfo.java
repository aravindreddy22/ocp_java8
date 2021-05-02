package com.practise.newocp.chapter7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

    public static void main(String[] args) {
        ExecutorService service= null;
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(()-> System.out.println(" Printing Zoo Inventory"));
            service.execute(()->{
                for(int i=0; i<3 ;i++)
                    System.out.println("Printing Record : "+i);
            });
            service.execute(()-> System.out.println(" Printing Zoo Inventory"));
            System.out.println("END");
        }catch (Exception e){

        }
    }
}
