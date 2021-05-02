package com.practise.newocp.chapter5.locale;

import javax.swing.text.DateFormatter;
import java.awt.dnd.DropTarget;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterExample {

    public static void main(String[] args) {
        //Method1
        LocalDate date= LocalDate.of(2012,12,31);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        //ISO_DATE_TIME Standard
        LocalDate date1= LocalDate.of(2012,12,31);
        LocalTime time= LocalTime.of(12,34);
        LocalDateTime dateTime= LocalDateTime.of(date1,time);
        // Formating
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        //Format Style Short
        DateTimeFormatter shortDateTime= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date1));
       // System.out.println(shortDateTime.format(time)); // This is throwing error since we are formatting only date
        //and time cannot be formatted as date. ofLccalizedDate

        // medium
        DateTimeFormatter mediumf= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(mediumf.format(dateTime));
        System.out.println(dateTime.format(mediumf));

        // Personalized date time formatter

        DateTimeFormatter pf= DateTimeFormatter.ofPattern("MM-dd-YYYY,hh:mm");
        System.out.println(pf.format(dateTime));
        System.out.println(dateTime.format(pf));

       // we don't have ofPattern method for the DateFormatter.

        //Parse the date Formatter

        DateTimeFormatter df4= DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date2= LocalDate.parse("01 02 2015",df4);
        LocalTime time2= LocalTime.parse("11:22");
        System.out.println(date2);
        System.out.println(time2);

    }
}
