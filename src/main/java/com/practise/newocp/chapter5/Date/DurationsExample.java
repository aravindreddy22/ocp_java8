package com.practise.newocp.chapter5.Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationsExample {

    public static void main(String[] args) {
        Duration daily= Duration.ofDays(1);
        Duration hourly = Duration.ofHours(1);
        Duration evryMinuet= Duration.ofMinutes(1);
        Duration everyTenSeconds= Duration.ofSeconds(10);
        Duration everyMilli= Duration.ofMillis(1);
        Duration everyNano= Duration.ofNanos(1);

        // Duration doesn't have a constructor that takes multiple units like period does.

        //Duration includes another more generic Factory method. ChronUnit

        Duration daily1= Duration.of(1, ChronoUnit.DAYS);
        Duration hourly1 = Duration.of(1,ChronoUnit.HOURS);
        Duration evryMinuet1= Duration.of(1,ChronoUnit.MINUTES);
        Duration everyTenSeconds1= Duration.of(10,ChronoUnit.SECONDS);
        Duration everyMilli1= Duration.of(1,ChronoUnit.MILLIS);
        Duration everyNano1= Duration.of(1,ChronoUnit.NANOS);
        Duration halfDay= Duration.of(1,ChronoUnit.HALF_DAYS); // represents 12 hours

        //ChronoUnit is used to find the differences
        LocalTime one= LocalTime.of(5,15);
        LocalTime two=LocalTime.of(6,30);
        LocalDate date= LocalDate.of(2016,1,20);

        System.out.println(ChronoUnit.HOURS.between(one,two));
        System.out.println(ChronoUnit.MINUTES.between(one,two));
       // System.out.println(ChronoUnit.MINUTES.between(one,date));

        // we can add Date Time same way as period does
        LocalDate date1= LocalDate.of(2015,1,20);
        LocalTime time= LocalTime.of(6,15);
        LocalDateTime dateTime= LocalDateTime.of(date1,time);
        Duration duration= Duration.ofHours(6);
        System.out.println(time.plus(duration));
        System.out.println(dateTime.plus(duration));
       // System.out.println(date1.plus(duration));

        // we can even add 23 hours and see what happens
        LocalDate date2= LocalDate.of(2015,1,20);
        LocalTime time2= LocalTime.of(6,15);
        LocalDateTime dateTime1= LocalDateTime.of(date2,time2);
        Duration duration1= Duration.ofHours(23);
        System.out.println(time2.plus(duration1));
        System.out.println(dateTime1.plus(duration1));
        // System.out.println(date2.plus(duration));



    }
}
