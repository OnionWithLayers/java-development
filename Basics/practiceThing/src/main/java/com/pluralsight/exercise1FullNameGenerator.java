package com.pluralsight;

import java.util.Scanner;

public class exercise1FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine().trim();

        int space = fullName.indexOf(" ");
        String firstName = fullName.substring(0, space);
        System.out.println("Your first name is " + firstName + ", huh.");

        String lastName = fullName.substring(space + 1);
        System.out.println("Your last name is " + lastName + " too...");

        //

        System.out.println("Please enter your name: ");

        System.out.println("First name: ");
        String fName = scanner.nextLine().trim();

        System.out.println("Last name: ");
        String lName = scanner.nextLine().trim();

        System.out.println("Middle name: ");
        String mName = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String sName = scanner.nextLine().trim();

        String govName = fName;

        if (!mName.isEmpty()) {
            govName += " " + mName.charAt(0) + ".";
        }
        govName += " " + lName; //the += is adding more to it while assigning it to the variable

        if (!sName.isEmpty()) {
            govName += ", " + sName + ".";
        }
        System.out.println("Your government name is: " + govName);
    }
}
