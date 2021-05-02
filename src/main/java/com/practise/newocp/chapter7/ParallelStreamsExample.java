package com.practise.newocp.chapter7;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamsExample {

    public static void main(String[] args) {
        Stream<Integer> stream= Arrays.asList(1,2,3,4,5,6).stream();
        Stream<Integer> parallelStream= stream.parallel();

        Stream<Integer> parallelStream2= Arrays.asList(1,3,4,5,6).parallelStream();

        parallelStream.forEach(System.out::println);

        parallelStream2.forEachOrdered(System.out::println);

        //Independent Operations

        System.out.println("Independent Operation");
        Arrays.asList("jockey", "Kangaroo", "Lemur")
                .parallelStream()
                .map(s -> s.length())
                .forEach(System.out::println);

        System.out.println("Independent Operation UpperCase");
        Arrays.asList("jockey", "Kangaroo", "Lemur")
                .parallelStream()
                .map(s -> {
                    System.out.println(s.toUpperCase());
                    return s.toUpperCase();
                })
                .forEach(System.out::println);

        //Avoid stateful operation

        System.out.println("Avoiding the stateful Operation");
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1,2,3,4,5,6).parallelStream()
                .map(i->{data.add(i);return i;})
                .forEachOrdered(System.out::println);

        System.out.println();
        data.forEach(System.out::println);

        //performing Order based tasks
        System.out.println("performing Order based tasks");
        System.out.print(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
        System.out.print(Arrays.asList(1,2,3,4,5,6).parallelStream().skip(2).findAny().get());

        //reduce example
        System.out.println("reduce Example");
        System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream()
        .reduce("",(s1,s2)->s1+s2,(s3,s4)->s3+s4));

        //Collect Example
        System.out.println("Collect Example");
        Stream<String > stringStream= Stream.of("w","o","l","f").parallel();
        SortedSet<String> set= stringStream.collect(ConcurrentSkipListSet::new,Set::add,Set::addAll);
        System.out.println(set);

        //one-argument collect
        System.out.println(" one Argument Collect");
        Stream<String> stringStream1= Stream.of("w","o","l","f").parallel();
        Set<String> set1= stringStream1.collect(Collectors.toSet());
        System.out.println(set1);

        // Complex collect
        Stream<String> ohMy= Stream.of("lions","tigers","bears").parallel();
        ConcurrentMap<Integer,String> map= ohMy.collect(Collectors.toConcurrentMap(String::length,k->k,(s1,s2)->s1+","+s2));
        System.out.println(map);
        System.out.println(map.getClass());

        //grouping by example
        Stream<String> ohMy1= Stream.of("lions","tigers","bears").parallel();
        ConcurrentMap<Integer,List<String >> map1= ohMy1.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map1);



    }
}
