package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.println("First name:");
        String firstName = scanner.nextLine().trim();
        //.trim gets rid of any whitespace the user might have inputted
        System.out.println("Middle name:");
        String middleName = scanner.nextLine().trim();

        System.out.println("Last name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix");
        String suffix = scanner.nextLine().trim();

        // System.out.println("Hello " + firstName + " " + middleName + " " + lastName + " " + suffix);
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + ".";
            //if the middle name is NOT empty, make the fullName equalto fullName(which rn is only first name) + ", " + middleName + "."
        }

        fullName += " " + lastName;
        //now it takes the new full
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println("\nFull name: " + fullName);
    }
}

