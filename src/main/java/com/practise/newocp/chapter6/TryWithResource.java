package com.practise.newocp.chapter6;

public class TryWithResource {

    public static void main(String[] args) {

      /*  try(StuckTurkeyCage st= new StuckTurkeyCage()){
            System.out.println(" Inside the try block");
        }*/

      try(JammedTurkeyCage jammedTurkeyCage= new JammedTurkeyCage();
          JammedTurkeyCage jammedTurkeyCage2= new JammedTurkeyCage(); ){
          throw new IllegalStateException(" turkeys ran off");
          //System.out.println("Put Turkeys in ");
      } catch (IllegalStateException e){
          System.err.println(" Caught :"+e.getMessage());
          for(Throwable th:e.getSuppressed()){
              System.out.println(th.getMessage());
          }
      }
    }
}

class StuckTurkeyCage implements AutoCloseable{

    public void close() {
        //throw new IOException();
        System.out.println("Closed method is called");
    }

}

class JammedTurkeyCage implements AutoCloseable{

    public void close() throws IllegalStateException{
        throw new IllegalStateException(" Cage door doescn't close");
    }
}