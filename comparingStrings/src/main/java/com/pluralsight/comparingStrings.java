package com.pluralsight;

public class comparingStrings {

    public static void main(String[] args) {
        String s1 = "ABC";

        String s2 = "ABC";

        String s3 = new String("ABC");

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
        System.out.println("S3: " + s3);

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("This is correct");
        }

        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("The second one is also correct");
        }
    }
}
