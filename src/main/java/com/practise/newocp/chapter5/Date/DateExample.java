package com.practise.newocp.chapter5.Date;

import java.time.*;

public class DateExample {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date= LocalDate.of(2015, Month.AUGUST,12);
        LocalDate date1= LocalDate.of(2016,01,12);
        System.out.println(date);
        System.out.println(date1);
        System.out.println(ZoneId.systemDefault());
        //ZoneId.getAvailableZoneIds().stream().filter(z->z.contains("US")|| z.contains("America")).forEach(System.out::println);

        //Local Time
        LocalTime localTime= LocalTime.of(6,15);
        System.out.println(localTime);
        LocalTime localTime1= LocalTime.of(6,15,20);
        System.out.println(localTime1);
        LocalTime localTime2=LocalTime.of(6,15,20,200);
        System.out.println(localTime2);

        LocalDateTime localDateTime=LocalDateTime.now();

        //Zoned Time Creation
        ZoneId zoneId= ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime=ZonedDateTime.of(2015,1,20,6,15,30,200,zoneId);
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1=ZonedDateTime.of(date1,localTime1,zoneId);
        System.out.println(zonedDateTime1);
        ZonedDateTime zonedDateTime2=ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime1);


    }
}
