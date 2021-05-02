package com.practise.newocp.chapter3;

import java.util.*;
import java.util.function.*;

public class DuckHelper {

    public static int compareByWeight(Duck d1,Duck d2){
        return d1.weight-d2.weight;
    }


    public static int compareByName(Duck d1,Duck d2){
        return d1.name.compareTo(d2.name);
    }

    public static void main(String[] args) {

        Comparator<Duck> byWeight= (d1,d2)->DuckHelper.compareByWeight(d1,d2);
        Comparator<Duck> byName= (d1,d2)->DuckHelper.compareByName(d1,d2);

        //Modified using the Method Reference
        Comparator<Duck> byWeight1= DuckHelper::compareByWeight;
        Comparator<Duck> byName2= DuckHelper::compareByName;

        Consumer<List<Integer>> methodRef1= Collections::sort;

        Consumer<List<Integer>> lambda= l->Collections.sort(l);

        String str= "abc";
        Predicate<String> methodref2= str::startsWith;
        Predicate<String> lambda2= s->str.startsWith(s);

        //we call an instance on the method without knowing the instance in advance
        Predicate<String> methodref3= String::isEmpty;
        Predicate<String> lambda3= s->s.isEmpty();

        System.out.println(methodref3.test("hello"));

        //Constructor reference
        Supplier<ArrayList> methodRef4=ArrayList::new;
        Supplier<ArrayList> lambda4=()-> new ArrayList();


        List<String> list = new ArrayList<>();
        list.add("magician");
        list.add("Assistant");
        System.out.println(list);
        list.removeIf(s->s.startsWith("A"));
        System.out.println("****************************");
        list.forEach(System.out::println);
     //   System.out.println(list);

        List<Integer> list1= Arrays.asList(1,4,8,10);
        System.out.println(list1);
        list1.replaceAll(x->x*2);
        System.out.println(list1);

        List<String> cats= Arrays.asList("Annie","Rippley");
        cats.forEach(c-> System.out.println(c));
        cats.forEach(System.out::println);

        //MAPS new Methods that are just added here
        Map<String,String> favourites= new HashMap<>();
        favourites.put("Jenny","Bus Tour");
        favourites.put("Tom",null);
        favourites.putIfAbsent("Jenny","tram");
        favourites.putIfAbsent("Tom","tram");
        favourites.putIfAbsent("Sam","tram");

        System.out.println(favourites);

        //  MERGE METHOD
        BiFunction<String ,String,String > mapper= (v1,v2)-> v1.length()>v2.length()?v1:v2;

        Map<String,String > fav= new HashMap<>();
        fav.put("Jenny","Bus Tour");
        fav.put("tom","Tram");
        String jenny=fav.merge("Jenny","skyride",mapper);
        String tom=fav.merge("tom","skyride",mapper);
        String sam=fav.merge("sam","skyride",mapper);
        System.out.println(fav);
        System.out.println(jenny);
        System.out.println(tom);
        System.out.println(sam);


        BiFunction<String,String ,String> nmapper=(v1,v2)->null;
        Map<String,String > fav1= new HashMap<>();
        fav.put("Jenny","Bus Tour");
        fav.put("tom","null");
        String jenny4=fav.merge("Jenny","skyride",mapper);
        String tom1=fav.merge("tom","skyride",mapper);
        System.out.println(" The tom1 value: "+tom1);
        System.out.println("The Null Function validator: "+fav1);

   //Compute if Present and Compute if Absent is called
        Map<String ,Integer> counts= new HashMap<>();
        counts.put("Jenny",1);
        counts.put("Sam",null);
         BiFunction<String ,Integer,Integer> mapper1= (k,v)->v+1;

         Integer jenny1= counts.computeIfPresent("Jenny",mapper1);
         Integer sam1= counts.computeIfPresent("Sam",mapper1);

        System.out.println(counts);
        System.out.println(jenny1);
        System.out.println(sam1);
        System.out.println(counts);

        //compute if Absent
         Map<String,Integer> counts2= new HashMap<>();
         counts2.put("Jenny",10);
         counts2.put("Tom",null);

         Function<String,Integer> mapper2= (k)->1;

         counts2.computeIfAbsent("Jenny",mapper2);
         counts2.computeIfAbsent("Tom",mapper2);
         counts2.computeIfAbsent("Sam",mapper2);
        System.out.println(counts2);



    }
}


class DuckHelperRun{
    public static void main(String[] args) {
        List<Duck> ducks= new ArrayList<>();
        Collections.sort(ducks,DuckHelper::compareByWeight);
        
    }
}