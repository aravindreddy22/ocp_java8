package com.practise.newocp.chapter7;

public class PrintData implements Runnable {

    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Printing Record :"+i);
            System.out.println(" The Thread Name"+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        Thread thread= new Thread(new PrintData());
        thread.start();
    }
}

class ReadInventory extends Thread{

    public void run(){
        System.out.println(" Printing Zoo Inventory ");
        System.out.println(" The Thread Name"+Thread.currentThread());
    }

    public static void main(String[] args) {
    //    new Thread(new ReadInventory()).start();

        System.out.println(" Begin");
        /*new Thread(new ReadInventory()).start();
        new Thread(new PrintData()).start();
        new Thread(new ReadInventory()).start();*/
        new Thread(new ReadInventory()).run();
        new Thread(new PrintData()).run();
        new Thread(new ReadInventory()).run();
        System.out.println("End");
        // calling the Run method
    }
}