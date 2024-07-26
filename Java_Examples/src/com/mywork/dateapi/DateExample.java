package com.mywork.dateapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExample {
    public static void main(String[] args) {
        localDateMethod();
        zonedTimeAndDate();
    }

    private static void localDateMethod() {
        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                date);


        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+
                time);


        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+
                current);


        // to print in a particular format
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = current.format(format);

        System.out.println("in formatted manner "+
                formatedDateTime);


        // printing months days and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month : "+month+" day : "+
                day+" seconds : "+seconds);

        // printing some specified date
        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("the republic day :"+date2);

        // printing date with current time.
        LocalDateTime specificDate =
                current.withDayOfMonth(25).withYear(2024);

        System.out.println("specific date with "+
                "current time : "+specificDate);

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

//add 1 week to the current date
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next Week: " + nextWeek);

        System.out.println("Previous Week: " + today.minusWeeks(1));

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after 10 year: " + nextDecade);
    }

    private static void zonedTimeAndDate()
    {
        // to get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+
                currentZone.getZone());

        // getting time zone of specific place
        // we use withZoneSameInstant(): it is
        // used to return a copy of this date-time
        // with a different time-zone,
        // retaining the instant.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone =
                currentZone.withZoneSameInstant(tokyo);

        System.out.println("tokyo time zone is " +
                tokyoZone);

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = tokyoZone.format(format);

        System.out.println("formatted tokyo time zone "+
                formatedDateTime);

    }
}
