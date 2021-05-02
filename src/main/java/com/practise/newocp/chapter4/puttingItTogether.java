package com.practise.newocp.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class puttingItTogether {

    public static void main(String[] args) {
        //Example1
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        //Example2
       /* Stream<String> stream= Stream.generate(()->"Elisa");
        stream
                .filter(n->n.length()==4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);*/

        //Example3
        Stream<String> stream1= Stream.generate(()->"Elisa");
        stream1
                .filter(n->n.length()==5)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        //Example4 peek

        Stream<Integer> infinite= Stream.iterate(1,n->n+1);

        infinite.limit(5)
                .peek(System.out::println)
                .filter(n->n%2 ==1)
                .forEach(System.out::println);

        // Revisited the Example

        Stream<Integer> infinite2= Stream.iterate(1,n->n+1);

        infinite2.limit(5)
                .filter(n->n%2 ==1)
                .peek(System.out::println)
                .forEach(System.out::println);



    }
}
