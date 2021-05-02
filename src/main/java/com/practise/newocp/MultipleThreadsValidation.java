package com.practise.newocp;

public class MultipleThreadsValidation  implements  Runnable {
    @Override
    public void run()  {
        method1();
       // method1();
    }


    public  synchronized void method1() {
       try {
           System.out.println("before:"+Thread.currentThread());
           Thread.sleep(10000);
           System.out.println("after:"+Thread.currentThread());
       }catch (Exception ex){

       }
    }

    public static void main(String[] args) {
        Thread T1= new Thread(new MultipleThreadsValidation());
        Thread T2= new Thread(new MultipleThreadsValidation());
        T1.start();
        T2.start();

    }



}


