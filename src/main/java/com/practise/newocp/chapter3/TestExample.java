package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestExample {

    public static void main(String[] args) {

        List<Number> numbers= new ArrayList<>();
        numbers.add(new Integer(12));
        numbers.add(312L);
        numbers.add(7);


        List<? super String> objects= new ArrayList<>();
        //objects.add("Apple");
        //objects.add("mangp");
       // objects.add(new Object());

        objects.forEach(System.out::println);

        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);   t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1); t2.add(s2);
        System.out.println("*****************");
        System.out.println(t1 + " " + t2);
    }
}

class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    Sorted(int n, String t) {
        this.num = n;
        this.text = t;
    }
    public String toString() { return "" + num; }
    public int compareTo(Sorted s) { return text.compareTo(s.text); }
    public int compare(Sorted s1, Sorted s2) { return s1.num-s2.num; }
}
