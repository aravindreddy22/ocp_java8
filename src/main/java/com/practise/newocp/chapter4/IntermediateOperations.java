package com.practise.newocp.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {


    public static void main(String[] args) {

        //filter method

        Stream<String > s= Stream.of("monkey","gorilla","bonobo");
        s.filter(x->x.startsWith("m")).forEach(System.out::println);

        //distnct

        Stream<String> s2= Stream.of("duck","duck","goose");
        s2.distinct().forEach(System.out::println);

        //limit and skip

        Stream<Integer > s3= Stream.iterate(1,n -> n+1);
        s3.skip(5).limit(2).forEach(System.out::println);

        //map() method

        Stream<String > s4= Stream.of("monkey","gorilla","bonobo");
        s4.map(x->x.length()).forEach(System.out::println);

        //flatMap()
        List<String> zero= Arrays.asList();
        List<String> one= Arrays.asList("Bonboo");
        List<String> two= Arrays.asList("Mother Gorilla","Baby gorilla");
        Stream<List<String>> s5= Stream.of(zero,one,two);
        s5.flatMap(l->l.stream()).forEach(System.out::println); // it combine the list of streams to stream.

        //sorted

        Stream<String> s6= Stream.of("brown-","bear-");
        s6.sorted().forEach(System.out::println);


        Stream<String> s7= Stream.of("brown bear-","grizzly-");
        s7.sorted(Comparator.reverseOrder()).forEach(System.out::println); // It takes two strings and return int.
       // s7.sorted(Comparator::reverseOrder).forEach(System.out::println);
        //This doesn't work because it didn't take any arguments and return comparator.

        //peek

        Stream<String > s8= Stream.of("brown bear-","grizzly-");
        long count= s8.peek(System.out::println).count();
        System.out.println(count);

        //Don't change the state with the peek.

        List<Integer> number = new ArrayList<>();
        number.add(1);
        List<Character> characters= new ArrayList<>();
        characters.add('a');
        StringBuilder builder= new StringBuilder();
        Stream<List<?>> good= Stream.of(number,characters);
        good.peek(l->builder.append(l)).forEach(System.out::println);
        System.out.println(builder);

        //bad one
        Stream<List<?>> bad= Stream.of(number,characters);
        bad.peek(l->l.remove(0)).forEach(System.out::println);

    }
}
