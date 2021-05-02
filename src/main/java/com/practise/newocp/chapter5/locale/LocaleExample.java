package com.practise.newocp.chapter5.locale;

import java.util.Locale;

public class LocaleExample {

    public static void main(String[] args) {

        Locale locale= Locale.getDefault();
        System.out.println("Locale.getDefault():" +locale); //en_US
        // english languague and US country name

        //ways of Creating Locale
        //WAY1:
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        //WAY2:
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("en","US"));

        //WAY3:
        Locale locale1= new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(locale1);

        // we can set the default Locale.
        Locale locale2= new Locale("fr","CN");
        Locale.setDefault(locale2);
        System.out.println(Locale.getDefault());
    }
}
