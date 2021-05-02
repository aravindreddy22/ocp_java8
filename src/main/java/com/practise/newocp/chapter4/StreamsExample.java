package com.practise.newocp.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        //Creating the Stream
        Stream<String> empty= Stream.empty();
        Stream<Integer> singleElement= Stream.of(1);
        Stream<Integer> formArray= Stream.of(1,2,3);
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Stream<Integer> fromList= list.stream();
        Stream<Integer> fromListParallel= Arrays.asList(1,3,5,6).parallelStream();
        fromList.forEach(System.out::println);
        fromListParallel.forEach(System.out::println);

        //Infinite Streams
        Stream<Double> random= Stream.generate(Math::random);
        Stream<Integer> oddnumber= Stream.iterate(1,n->n+2);





    }
}
