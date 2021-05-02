package com.practise.newocp.chapter4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        //Supplier

        Supplier<LocalDate> s1= LocalDate::now;

        Supplier<LocalDate> s2= ()-> LocalDate.now(); //There is the static method to return it.

        LocalDate d1= s1.get();

        LocalDate d2= s2.get();

        System.out.println( " The date d1 = "+d1 +"\n d2 = "+d2);

        //Second

        Supplier<ArrayList<String>> s3= ArrayList::new;
        ArrayList<String > a1= s3.get();
        System.out.println(a1);
        System.out.println(s3);

        //Consumer Example

        Consumer<String > c1= System.out::println;
        Consumer<String > c2= s-> System.out.println(s);

        c1.accept("Aravind");
        c2.accept("Aravind2");

        //BiConsumer
        Map<String ,Integer> map= new HashMap<>();

        BiConsumer<String,Integer> b1= map::put;

        BiConsumer<String ,Integer> b2=(key,value) ->map.put(key,value);

        b1.accept("chicken",10);
        b2.accept("egg",20);

        System.out.println(map);

        //Predicate example

        Predicate<String> p1= String::isEmpty;

        Predicate<String > p2= s->s.isEmpty();

        System.out.println(p1.test(new String()));

        System.out.println(p2.test("Aravind"));

        //BiPredicate

        BiPredicate<String,String > bp1= String::startsWith;

        BiPredicate<String ,String > bp2= (string,prefix)-> string.startsWith(prefix);

        System.out.println(bp1.test("Aravind","A"));

        System.out.println(bp2.test("Manish","M"));


        Predicate<String> pc1= p1.and(p2);

         // There is something Or or negate.
        System.out.println(pc1.test("Aravind"));


        //Function and BiFunction

        Function<String, Integer> f1= String::length;
        Function<String,Integer> f2= x->x.length();

        System.out.println(f1.apply("Aravind"));
        System.out.println(f2.apply("Aravind"));


        BiFunction<String ,String ,String > bf1= String::concat;
        BiFunction<String ,String ,String > bf2= (s11,s12)-> s11.concat(s12);

        System.out.println(bf1.apply("Aravind","Redddy"));
        System.out.println(bf1.apply("Aravind","Letakula"));

        // we can also create custom interface.

        //Unary and Binary Operator

        UnaryOperator<String > u1= String::toUpperCase;
        UnaryOperator<String > u2= x->x.toUpperCase();

        System.out.println(u1.apply("aravind"));
        System.out.println(u2.apply("aravind"));

        BinaryOperator<String> bo1= String::concat;
        BinaryOperator<String> bo2= (s21,s22)->s21.concat(s22);

        Predicate<String> egg= a-> a.contains("egg");
        Predicate<String> brown= b-> b.contains("brown");

        Predicate<String> brownEggs= egg.and(brown);
        System.out.println("*****************************");
        System.out.println(brownEggs.test("brown eggs"));

      /*  BiPredicate<String,String> begg= String::contains;
        BiPredicate<String,String> bbrown= String::contains;

        BiPredicate<String, String> bbrownEggs= begg.and(bbrown);
        System.out.println("*****************************");
        System.out.println(bbrownEggs.test("brown eggs","brown"));*/

        Predicate<String> ex4 = String::isEmpty;
        System.out.println(ex4.test(""));
    }

}
