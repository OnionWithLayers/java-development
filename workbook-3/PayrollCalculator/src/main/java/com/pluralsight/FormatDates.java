package com.pluralsight;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
        String userInput = "09/05/2021";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(userInput, formatter1);
        System.out.println("Today's date is: " + date);

        String userInput2 = "2021-09-05";
        LocalDate formatter2 = LocalDate.parse(userInput2);
        System.out.println("The date is: " + formatter2);

        DateTimeFormatter specificDate = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formattedDate = formatter2.format(specificDate);
        System.out.println(formattedDate);

        //'instant' gets the time right now
        Instant instant = Instant.now();
        //gets zone id of GMT
        ZoneId zone = ZoneId.of("GMT");
        //changes the date pattern to whats in the parentheses
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH: mm");
        //gets the instant of time right now --> at the zone of (whatever time zone you assigned earlier
        //--> abd then formats it to whatever pattern you put earlier
        String formatTheFormattedTime = instant.atZone(zone).format(formattedTime);
        System.out.println("The time in GMT is: " + formatTheFormattedTime);

        System.out.println("===================");


    }
}
