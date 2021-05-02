package com.practise.newocp.chapter7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {

    private Map<String,Object> foodData= new HashMap<>();

    public synchronized void put(String key,Object value){
        foodData.put(key, value);
    }

    public synchronized Object get(String key){
      return foodData.get(key);
    }


    public static void main(String[] args) {
       // Map<String,Object> foodData1= new HashMap<>();
        Map<String,Object> foodData1= new ConcurrentHashMap<>();
        foodData1.put("pengin",1);
        foodData1.put("flamingo",2);
        for(String key:foodData1.keySet())
            foodData1.remove(key);

    }
}
