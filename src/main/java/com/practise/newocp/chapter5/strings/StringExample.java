package com.practise.newocp.chapter5.strings;

public class StringExample {

    public static void main(String[] args) {
        //Logic1
        String s1 = "bunny";
        String s2 = "bunny";
        String s3= new String("bunny");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        //logic2

        String s4= "1"+2+3;
        String s5= 1+2+"3";
        System.out.println(s4);
        System.out.println(s5);

        // string methods
        String s= "abcde";
        System.out.println(s.trim().length());
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf("bc"));
        System.out.println(s.substring(2,4).toUpperCase());

        //String Builder
        StringBuilder sb= new StringBuilder();
        sb.append("-").append(12345).append("*");
        System.out.println(sb);


    }
}
