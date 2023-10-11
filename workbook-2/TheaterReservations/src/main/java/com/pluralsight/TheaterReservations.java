package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;

        System.out.println("Please enter your full name:");
        String fullName = scanner.nextLine().trim();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        System.out.println("What date will you be attending? (MM/dd/yyyy)");
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date, formatter);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        if(tickets > 1){
            System.out.println(tickets + " tickets reserved for " + date1 + " under " + lastName + ", " + firstName);
        } else{
            System.out.println(tickets + " ticket reserved for " + date1 + " under " + lastName + ", " + firstName);
        }
    }
}
