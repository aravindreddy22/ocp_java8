package com.practise.newocp.chapter4;

import java.util.Optional;
import java.util.OptionalInt;

public class ChainingOptionals {

    public static void main(String[] args) {
        // This is Optional
        Optional<Integer> optional= Optional.of(123);
        optional.map(n->""+n)
                .filter(s->s.length()==3).ifPresent(System.out::println);


        Optional<String> soptional= Optional.of("1234");
        Optional<Integer> result= soptional.map(String::length);
        System.out.println(result);
        System.out.println(result.get());


    }
}
