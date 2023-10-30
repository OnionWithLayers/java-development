package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class LocalTimes {
    public static void main(String[] args) {

        //LocalDate useful for holding dates like b-days
        LocalDate today = LocalDate.now();
        System.out.println("today is: " + today);

        //prints out the date and time
        LocalDateTime todaysDateAndTime = LocalDateTime.now();
        System.out.println(todaysDateAndTime);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);

        DateTimeFormatter diffFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String input = "09/17/2017";
        LocalDate randomDate = LocalDate.parse(input, diffFormat);
        System.out.println(randomDate.format(diffFormat));

        System.out.println("========================");


        DateTimeFormatter thisFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                                               //'today' is a presaved word in IJ for LocalDate for today
        System.out.println("today's date is: " + today.format(thisFormat));

        LocalDate thisDate = LocalDate.now();
        System.out.println("thisDate is " + thisDate);

        //OR
        System.out.println("thisDate is " + today);

        System.out.println("=====================");

        Instant now = Instant.now();
        ZoneId zone = ZoneId.of("UTC");
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("E, MMM dd, yyyy, HH:mm");
        String fmtTime = now.atZone(zone).format(formattedTime);
        System.out.println("Seoul, South Korea's time right now is: " +   fmtTime);

    }
}
