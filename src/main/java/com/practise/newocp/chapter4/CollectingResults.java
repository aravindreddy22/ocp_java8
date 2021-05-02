package com.practise.newocp.chapter4;

import javax.swing.plaf.SliderUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {

    public static void main(String[] args) {

        // Joining by comma seperated
        Stream<String> ohmy= Stream.of("lions","tigers","bears");
        String result=ohmy.collect(Collectors.joining(","));
        System.out.println("Joining : " +result);

        //calculating average
        List<String> slist= Arrays.asList("lions","tigers","bears");
        Double result1= slist.stream().collect(Collectors.averagingInt(String::length));
        System.out.println("average : "+result1);

        //mapping to Treeset
        TreeSet<String> tSet= slist.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(" Treeset : " +tSet);

        //Collecting into Maps
        Map<String,Integer>  map= slist.stream().collect(Collectors.toMap(s->s,String::length));
        System.out.println("map :"+map);

        //we can add the values with comma seperated
        Map<Integer,String>  map2= slist.stream().collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1+","+s2));
        System.out.println("map2 :"+map2);

        //if we need to choose specific map
        TreeMap<Integer,String> tmap= slist.stream().collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1+","+s2,()->new TreeMap()));
        System.out.println("tmap : "+tmap);

        //GroupingBy length with the List

        Map<Integer,List<String>> map1= slist.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(" grouping by List : "+map1);

        //Instead of List if we are using Set
        Map<Integer,Set<String>> map3= slist.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(" grouping by set : "+map3);

        //we can even change the type of map returned through
        TreeMap<Integer,Set<String>> map4= slist.stream().collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
        System.out.println(" grouping by TreeMap in set : "+map4);

        // we can also change the type to List.
        TreeMap<Integer,List<String>> map5= slist.stream().collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
        System.out.println(" grouping by treemap in List : "+map5);

        //parititioning is special type of dividing into two groups
        Map<Boolean,List<String>> map6= slist.stream().collect(Collectors.partitioningBy(s->s.length()>=3));
        System.out.println("partitiong :"+map6);

        //Instead of downStreams we can also use collector to specific type.
        Map<Integer,Long> map7=slist.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println("Map 7 : "+map7);

        //Mapping\
      /* Map<Integer,Optional<Character>> map8= slist.stream()
                .collect(Collectors
                        .groupingBy(
                                String::length,
                                Collectors.mapping(s->s.charAt(0),
                                        Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(map8);
*/
        // we can reduce the size of code by using the static imports

       /* Map<Integer,Optional<Character>> map9= slist.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.mapping(s->s.charAt(0),Collectors.minBy(Comparator.naturalOrder()))));
*/


    }
}
