package com.practise.newocp.chapter3;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        //Scenario 1:
        List<String> list = new ArrayList<>();
        list.add("fulffy");
        list.add("webby");
        String[] array = new String[list.size()];
        array[0]=list.get(0);
        array[1]=list.get(1);
        list.set(1,"Jimmy");
        for(String tmp: array)
            System.out.println(tmp + "-");
        //Scenario 2: when ArrayList is updated
        String[] array1={"gebril","mouse"};
        // converting array to the List
        List<String> list1= Arrays.asList(array1);
        list1.set(1,"test");
        System.out.println("Printing the list vlaues after list update");
        list1.forEach(System.out::println);
        for (String s : array1) {
            System.out.println("Array Values: "+s);
        }
        //Scenario 3: when Array is updated
        array1[0]="New Updated";
        System.out.println("Printing the list vlaues after array update");
        list1.forEach(System.out::println);
        for (String s : array1) {
            System.out.println("Array Values: "+s);
        }

        /**
         * If we Create the ArrayList using the List and if we modifiy the array then
         * the list values are updated.
         *
         * ASlist() := not being resizable.
         *
         */

        for(String tmpst: list1){
            System.out.println(tmpst);
        }

        //Converting List to the Array
        //Scenario 4: converting back to array and checking the array.
        list1.set(1,"List to Array Conversion -before");
        String[] array2= (String[]) list1.toArray();
        list1.set(1,"List to Array Conversion -after");
        //list1.remove(1);
        for(String tmparr: array2){
            System.out.println(tmparr);
        }
    }

}

class SortingExample{

    public static void main(String[] args) {

        //Playing with the Array
        Integer[] numbers= {6,8,7,1};
        Arrays.sort(numbers); // By default it will sort Ascending order
        for (Integer number : numbers) {
            System.out.println(" Ascending numbers :"+number);
        }
        //Sorting in Descending order
        Comparator<Integer> descComp= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
              if(01>02)
                return 1;
              else if(01<02)
                  return -1;
              else
                  return 0;
            }
        };
        Arrays.sort(numbers,descComp);
        System.out.println("===================================");
        for (Integer number : numbers) {
            System.out.println(" Descending numbers :"+number);
        }
        //Binary Searching:
        System.out.println(Arrays.binarySearch(numbers,6));
        System.out.println(Arrays.binarySearch(numbers,3));

        //Playing with the List
        List<Integer> list= Arrays.asList(9,7,5,3);
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println(Collections.binarySearch(list,3));
        System.out.println(Collections.binarySearch(list,4));


        // Java automatically do's Autoboxing.
        //Autoboxing is way of converting the int to Integer
        List<Integer> numbers1= new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(new Integer(3));
        numbers1.add(new Integer(5));
        numbers1.remove(1);
        numbers1.remove(new Integer(5));
        System.out.println(numbers1);
        int num= numbers1.get(0);
        System.out.println(num);

    }
}

