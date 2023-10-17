package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //date
        LocalDate today = LocalDate.now();
        System.out.println("today is " + today);

        //time
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is " + currentTime);

        //date and time
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now is " + rightNow);

        System.out.println("Day of week " + today.getDayOfWeek());
        System.out.println("Day of month " + today.getDayOfMonth());
        System.out.println("Day of year: " + today.getDayOfYear());

        System.out.println("Month Name: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Year: " + today.getYear());

        System.out.println("========================");

        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
        System.out.println("Nanosecond: " + currentTime.getNano());

        System.out.println("==============================");
        //                                                 name month day year hour min sec
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH: mm:(ss)");

        String formattedDate = rightNow.format(fmt);

        System.out.println("The formatted result is: " + formattedDate);

        System.out.println("================");
        String userInput = "2002-10-17";
        LocalDate birthday = LocalDate.parse(userInput);
        System.out.println(birthday);

        System.out.println("================");
        String userInput2 = "10/17/2002";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate bday = LocalDate.parse(userInput2,formatter);
        System.out.println(bday);
    }
}
