package com.practise.newocp.chapter5.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDates {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2020, Month.APRIL,07);
        LocalTime localTime= LocalTime.of(6,15);
        LocalDateTime localDateTime=LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        localDateTime=localDateTime.plusDays(2);System.out.println(localDateTime);
        localDateTime=localDateTime.plusMonths(1);System.out.println(localDateTime);
        localDateTime=localDateTime.plusYears(5);System.out.println(localDateTime);
        localDateTime=localDateTime.minusDays(2);System.out.println(localDateTime);

        //chaining Example
        LocalDate localDate1=LocalDate.of(2015,Month.APRIL,12);
        LocalTime localTime1= LocalTime.of(6,15);
        LocalDateTime localDateTime1= LocalDateTime.of(localDate1,localTime1).minusDays(1).plusDays(1).minusDays(2).minusHours(4).minusMinutes(30);
        System.out.println(localDateTime1);


    }
}
