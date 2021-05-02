package com.practise.newocp.chapter5.Date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExample {

    public static void main(String[] args) {
        Instant now= Instant.now();
        Instant later= Instant.now();
        Duration duration= Duration.between(now,later);
        System.out.println(duration.toMillis());

        // Convert Zoned Time to Instant
        LocalDate date= LocalDate.of(2015,5,25);
        LocalTime time= LocalTime.of(11,55,00);
        ZoneId zoneId= ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime= ZonedDateTime.of(date,time,zoneId);
        Instant instant= zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);

        //CREATE INSTINT FROM EPOCHSECONDS
        Instant instant1= Instant.ofEpochSecond(zonedDateTime.toEpochSecond());
        System.out.println(instant1);

        //Math with Instants
        Instant instant2= Instant.now();
        Instant nextday= instant2.plus(1, ChronoUnit.DAYS);
        System.out.println(nextday);
        Instant nextHour = instant2.plus(2,ChronoUnit.HOURS);
        System.out.println(nextHour);
        //Instant nextweek = instant.plus(1,ChronoUnit.WEEKS);

        // DayLight saving

        LocalDate date1= LocalDate.of(2016,Month.MARCH,13);
        LocalTime time1= LocalTime.of(1,30);
        ZoneId zoneId1= ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime1= zonedDateTime.of(date1,time1,zoneId1);
        System.out.println(zonedDateTime1);
        zonedDateTime1=zonedDateTime1.plusHours(1);
        System.out.println("1hr which doesn't exist" +zonedDateTime1);

        //same thing in the November
        LocalDate date2= LocalDate.of(2016,Month.NOVEMBER,6);
        LocalTime time3= LocalTime.of(1,30);
        ZonedDateTime zonedDateTime2= zonedDateTime.of(date2,time3,zoneId1);
        System.out.println(zonedDateTime2);
        zonedDateTime2=zonedDateTime2.plusHours(1);
        System.out.println("November timimg which is switiching back " +zonedDateTime2);

        //creating the zoned time that doesn't exist
        LocalDate date3= LocalDate.of(2016,Month.MARCH,13);
        LocalTime time4= LocalTime.of(2,30);
        ZonedDateTime zonedDateTime3= zonedDateTime.of(date3,time4,zoneId1);
        System.out.println(" The time which is not existed : "+zonedDateTime3);
    }
}
