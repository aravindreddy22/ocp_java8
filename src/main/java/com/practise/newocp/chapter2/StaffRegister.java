package com.practise.newocp.chapter2;

public class StaffRegister {

    // we are able to mark the reference final,
    // which guarantees only one instance will be created within our application.
    public static final StaffRegister instance;

    static{
        instance= new StaffRegister();
    }
    private StaffRegister(){}

    public static StaffRegister getInstance(){
        return instance;
    }

    //Data Access Models
    //.......
}

