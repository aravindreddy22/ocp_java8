package com.practise.newocp.chapter1;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParasingExample {

    public static void main(String[] args) throws ParseException {

        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr= NumberFormat.getInstance(Locale.FRANCE);
        String s = "40.45";
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));

        // when extra charachters on parasing
        NumberFormat nf= NumberFormat.getInstance();
        String one= "456abc";
        String two= "-2.5165*10";
        String three = "x83.5";
        System.out.println( "one :" +nf.parse(one));
        System.out.println("Two :" +nf.parse(two));
        //System.out.println("three :"+nf.parse(three));

        //Currency Formatter

        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        double value= (Double) cf.parse(amt);
        System.out.println(value);


    }
}
