package com.practise.newocp.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedStreamsExample {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Annie");
        list.add("Ripley");
        Stream<String> stream= list.stream();
        list.add("KC");
        System.out.println(stream.count());
        list.add("abc");
    }
}
