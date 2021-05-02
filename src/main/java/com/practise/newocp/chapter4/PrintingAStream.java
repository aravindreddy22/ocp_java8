package com.practise.newocp.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintingAStream {

    public static void main(String[] args) {
        //way1
        List<String > list= Arrays.asList("monkey","donkey","parrot");
        list.stream().forEach(System.out::println);

        //way2
        Stream<String > s= list.stream();
        System.out.println(s.collect(Collectors.toList()));

        //way3
        Stream<String > s2= list.stream();
        s2.peek(System.out::println).count();

        //way4
        Stream<String > s3= list.stream();
        s3.limit(5).forEach(System.out::println);
    }
}
