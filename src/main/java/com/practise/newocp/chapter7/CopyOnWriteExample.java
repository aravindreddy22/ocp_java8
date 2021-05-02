package com.practise.newocp.chapter7;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class CopyOnWriteExample {

    public static void main(String[] args) {
        List<Integer> list= new CopyOnWriteArrayList<>(Arrays.asList(4,3,32));
        for(Integer item:list){
            System.out.println(item +"");
            list.add(9);
        }
        System.out.println();
        System.out.println(list.size());
    }
}

class SynchronizedList{

    public static void main(String[] args) {
        List<Integer> list= Collections.synchronizedList(new ArrayList(Arrays.asList(4,3,54)));
        synchronized (list){
            list.forEach(System.out::println);
        }

    }
}