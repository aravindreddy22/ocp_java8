package com.practise.newocp.chapter6;

public class CannotSwimException extends Exception {

    public CannotSwimException(){
        super();
    }

    public CannotSwimException(String message){
     super(message);
    }

    public CannotSwimException(Exception e){
        super(e); // Wrapping the another Exception inside yours
    }


}
