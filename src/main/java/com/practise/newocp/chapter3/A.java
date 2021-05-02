package com.practise.newocp.chapter3;

import java.util.ArrayList;
import java.util.List;

public class A {
    public String name="aravind1";

    public String toString(){
        return name;
    }

}

class B extends A{

    public String name="aravind2";

    public String toString(){
        return name;
    }
}

class C extends B{

    public String name="aravind3";

    public String toString(){
        return name;
    }
}

class LowerBoundTest{

    public static void main(String[] args) {
        List<? super A> alist= new ArrayList<>();
        List<? super B> blist= new ArrayList<>();
        List<? super C> clist= new ArrayList<>();
        //alist.add(new C());
        alist.add(new A());
        blist.add(new B());
        clist.add(new C());
        printList(alist);
        printList(blist);
        printList(clist);
    /*    alist.add(new B());
        alist.add(new A());*/

    // Unbounded and upper-bound wildcards are immutable
        // so we can't add the value
    List<? > testList= new ArrayList<A>();
    //testList.add(new A());

        //we can add the subclasses and Interface Implements to the list
        List<B> tList= new ArrayList<B>();
        tList.add(new C());
        tList.add(new B());
       // tList.add(new A());

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
        tList.forEach(s-> System.out.println(s));
    }

    public static void printList(List<? super C> alist){

        for(Object obj: alist)
            System.out.println(obj);
    }
}

class UpperBoundTest{


    public static void main(String[] args) {

        List<? extends C> clist= new ArrayList<C>();
        List<? extends B> blist= new ArrayList<>();
        List<? extends A> alist= new ArrayList<>();

        printList(clist);
        printList(blist);
      //  printList(alist);
        /**
         This is not compiling.

  /*      clist.add(new C());
        clist.add(new B());
        clist.add(new A());*/


      //  m2(new ArrayList<A>());
        m2(new ArrayList<B>());
    }

    public static void printList(List<? extends B> alist){

        for(Object obj: alist)
            System.out.println(obj);
    }

    public static <T> T m1(List<? extends T> list){
        return list.get(0);
    }
    public static <T extends B> T m2(List<? extends T> list){
        return list.get(0);
    }

    public static <T> T m3(List<? extends T> list){
        return list.get(0);
    }



}

