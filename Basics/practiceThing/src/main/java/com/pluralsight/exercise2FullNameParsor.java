package com.pluralsight;

import java.util.Scanner;

public class exercise2FullNameParsor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine().trim();

        //initialize variables to store the first, middle, and last names
        String firstName = "";
        String midName = "";
        String lastName = "";

        //find the first space
        int firstSpace = fullName.indexOf(" ");

        if (firstSpace == -1) { //if there's only 1 name, then there won't be any space after it, so the only space there is, is the space behind the first name, and every index starts at "0", so in this case, it'll be "-1"
            //if there is only one word, it's the first and last name **idk what this means
            firstName = fullName;
            lastName = fullName;
        } else {
            //extract the first name
            firstName = fullName.substring(0, firstSpace);

            //removes the first name and leaves you with only the words after the first space
            fullName = fullName.substring(firstSpace).trim();

            int lastSpace = fullName.lastIndexOf(" ");

            if (lastSpace == -1) {
                lastName = fullName;
            } else {
                midName = fullName.substring(0, lastSpace);
                lastName = fullName.substring(lastSpace + 1);
            }
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (midName.isEmpty() ? "(none)": midName));
        System.out.println("Last name: " + lastName);
    }
}
