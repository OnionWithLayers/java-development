package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertingStringToDate {
    public static void main(String[] args) {
        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);

        System.out.println("The conversion is complete.");

        /////

        String userInput2;
        DateTimeFormatter formatter;

        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate birthDay2 = LocalDate.parse(userInput, formatter);
    }
    }

