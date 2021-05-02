package com.practise.newocp.chapter4;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        System.out.println(average(21,30,40));
        System.out.println(average());
        Optional<Double> opt= average(90,100);
        if(opt.isPresent())
            System.out.println(opt.get());


        Integer value=10;
        Optional o= (value==null)?Optional.empty():Optional.of(value);
        System.out.println(o);

        Integer value1=null;
        Optional o2=Optional.ofNullable(value1);
        System.out.println(o2);

        Optional<Double> opt3= average(90,100);
        opt3.ifPresent(System.out::println);

        Optional<Double> op4= average();
        System.out.println(op4.orElse(Double.NaN));
        System.out.println(op4.orElseGet(()->Math.random()));
        System.out.println(op4.orElseThrow(()->new IllegalArgumentException()));


    }

    public static Optional<Double>   average(int... scores){

        if(scores.length ==0){
            return Optional.empty();
        }
        int sum=0;
        for(int tmpsum: scores){
            sum+=tmpsum;
        }

        return Optional.of((double) sum/scores.length);
    }
}
