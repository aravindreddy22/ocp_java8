package com.practise.newocp.chapter4;

import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveExample {

    public static void main(String[] args) {
        // ways to calculate the sum
        List<Integer> list= Arrays.asList(1,2,3,4);
        System.out.println(list.stream().reduce(0,(a,b)->a+b));

        //way 2
        System.out.println(list.stream().mapToInt(x->x).sum());

        //way3
        IntStream intStream= IntStream.of(1,2,3);
        OptionalDouble avg= intStream.average();
        avg.ifPresent(System.out::println);
        System.out.println(avg.getAsDouble());

        //Double Stream
        DoubleStream empty= DoubleStream.empty();
        DoubleStream oneValue= DoubleStream.of(1.0);
        DoubleStream varargs= DoubleStream.of(1.0,1.1,1.2);
        oneValue.forEach(System.out::println);
        varargs.forEach(System.out::println);

        //infinite streams
        DoubleStream random= DoubleStream.generate(Math::random);
        DoubleStream fractions= DoubleStream.iterate(0.5,n->n/2);
        random.limit(5).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        //way5
        IntStream count= IntStream.iterate(1,n->n+1).limit(5);
        count.forEach(System.out::println);

        IntStream range= IntStream.range(1,6);
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1,5);
        rangeClosed.forEach(System.out::println);

        // Converting /mapping the streams from one place to other
        Stream<String > objStream=Stream.of("penguin","fish");
        IntStream intStream1= objStream.mapToInt(s->s.length());
        intStream1.forEach(System.out::println);

        //USing Optional Primitives
        IntStream intStream2= IntStream.rangeClosed(1,5);
        OptionalDouble optionalDouble= intStream2.average();
        optionalDouble.ifPresent(System.out::println);
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElseGet(()->Double.NaN));

        //LongStream
        LongStream longStream= LongStream.of(5,10);
        long sum=longStream.sum();
        System.out.println(sum);

        //Summarizing statistics
        IntStream intStream3= IntStream.of(1,2,3,4,5);
        OptionalInt optionalInt= intStream3.max();
        optionalInt.orElseThrow(RuntimeException::new);

        IntSummaryStatistics stats= IntStream.of(1,2,3,4,5).summaryStatistics();
        if(stats.getCount()==0)
            throw new RuntimeException();
        System.out.println(stats.getMax()-stats.getMin());

        //Primitive Functioanl Interfaces
        BooleanSupplier b1= ()->true;
        BooleanSupplier b2=()->Math.random()>0.5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());



    }
}
