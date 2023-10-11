package com.pluralsight;

import java.util.Scanner;

public class stringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String fullName = scanner.nextLine();
        //String fullName = "Daniel Kim";
        int length = fullName.length();

        System.out.println(length);

        System.out.println(fullName + " as all caps is:");
        fullName = fullName.toUpperCase();
        System.out.println(fullName);
    }
}
