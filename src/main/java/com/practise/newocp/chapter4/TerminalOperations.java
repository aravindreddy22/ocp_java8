package com.practise.newocp.chapter4;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        //count example it is the reduction
        Stream<String> s= Stream.of("monkey","gorilla","bonobo");
        System.out.println(" s.count() : "+s.count());

        //min and max  it is the reduction
        Stream<String > s2= Stream.of("monkey","ape","bonobo","abc");
        Optional<String> opt=s2.min((st1,st2)->st1.length()-st2.length());
        opt.ifPresent(System.out::println);

        Stream<String > s3= Stream.of("monkey","ape","bonobo");
        Optional<String> opt2=s3.max((st1,st2)->st1.compareTo(st2));
        opt2.ifPresent(System.out::println);

        Optional<?> minempty= Stream.empty().min((st1,st2)->0);
        System.out.println(minempty.isPresent());

        //findAny and FindFirst

        Stream<String> findany= Stream.of("monkey","gorilla","bonobo");
        Stream<String > infinate= Stream.generate(()->"chimp");
        findany.findAny().ifPresent(System.out::println);
        infinate.findAny().ifPresent(System.out::println);

        //allMatch anyMatch and noneMatch()

        List<String > list= Arrays.asList("monkey","2","chimp");
        Stream<String > infinite1=Stream.generate(()->"chimp");
        Predicate<String > pred= x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().noneMatch(pred));

        //forEach Method

        Stream<String > forStream= Stream.of("monkey","donkey","pinky");
        forStream.forEach(System.out::println);

        //reduce

        Optional<String> emptyOptional=Optional.empty();
        System.out.println("emptyOptional.isPresent():"+emptyOptional.isPresent());

        //T reduce(T identity, BinaryOperator<T> accumulator)
        Stream<String> stream= Stream.of("w","o","l","f");
        String word=stream.reduce("",(source,comb)->source+comb); // The return type is dependent on the identity
        //String word2=stream.reduce("",String::concat); // The return type is dependent on the identity
        System.out.println(word);
        //System.out.println(word2);

        //Optional<T> reduce(BinaryOperator<T> accumulator) := without Identity but the return type is Optional

        BinaryOperator<Integer> bop=(a,b)->a*b;
        Stream<Integer> empty= Stream.empty();
        Stream<Integer> oneElement= Stream.of(3);
        Stream<Integer> threeElements= Stream.of(3,5,6);
        empty.reduce(bop).ifPresent(System.out::println);
        oneElement.reduce(bop).ifPresent(System.out::println);
        threeElements.reduce(bop).ifPresent(System.out::println);

       // <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
        // combiner BinaryOperator mainly used during the parallel stream

        Stream<Integer> msig3=Stream.of(3,5,6);
        BinaryOperator<Integer> bop1= (a,b)->a*b;
        Integer result=msig3.reduce(1,bop1,bop1);
        System.out.println(result);

        //Collect := mutable reductions.

        //<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)

        Stream<String> collect1=Stream.of("w","o","l","f");
        StringBuilder word2=collect1.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
        System.out.println(word2);

        // Treeset
        Stream<String> collect2=Stream.of("w","o","l","f");
        TreeSet<String> word3=collect2.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(word3);

        //<R,A> R collect(Collector<? super T, A,R> collector)

        Stream<String> collect3=Stream.of("w","o","l","f");
        TreeSet<String> word4=collect3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(word4);

        //Just set made easy

        Stream<String> collect4=Stream.of("w","o","l","f");
        Set<String > set= collect4.collect(Collectors.toSet());
        System.out.println(set);




        ;



    }
}
