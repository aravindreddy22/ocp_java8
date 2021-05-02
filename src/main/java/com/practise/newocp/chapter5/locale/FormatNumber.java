package com.practise.newocp.chapter5.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {

    public static void main(String[] args) {

        int attendencesPerYear= 3_200_000;
        int attemdencePerMonth= attendencesPerYear/12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attemdencePerMonth));
        NumberFormat g= NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attemdencePerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attemdencePerMonth));

        //Format the Price
        double price = 48;
        NumberFormat priceformat = NumberFormat.getCurrencyInstance();
        System.out.println(priceformat.format(price));
        System.out.println();

        // The Format is always called on the formatter other than the number.

    }


}
