package com.practise.newocp.chapter5.Date;


import java.time.*;

public class PeriodsExample {

    public static void main(String[] args) {
        LocalDate start= LocalDate.of(2015, Month.JANUARY,01);
        LocalDate end= LocalDate.of(2015, Month.MARCH,31);
        Period period=Period.ofMonths(1);
        performAnimalEnrichment(start,end,period);

        //periods
        Period annualy=Period.ofYears(1);
        Period monthly= Period.ofMonths(1);
        Period weekly=Period.ofWeeks(1);
        Period daily= Period.ofDays(1);
        Period everyotherday= Period.ofDays(2);
        Period everyYearandweek = Period.of(1,0,7);
        //Method chaining is not allowed we can't create year first and chain to add week

        System.out.println(Period.ofYears(3));
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.ofWeeks(3));

        //valid Object with period

        LocalDate date= LocalDate.of(2020,01,21);
        LocalTime time = LocalTime.of(6,20);
        LocalDateTime dateandTime = LocalDateTime.of(date,time);
        Period period8=Period.ofMonths(1);
        System.out.println(date.plus(period8));
        System.out.println(dateandTime.plus(period8));
        //System.out.println(time.plus(period8));




    }

    public static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        LocalDate upTo=start;
        while(upTo.isBefore(end)){
            System.out.println(" Give a new Toy : "+upTo);
            upTo=upTo.plus(period);
        }
    }
}
