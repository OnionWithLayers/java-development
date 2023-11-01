package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        StaticClasses guy1 = new StaticClasses("Jon", "The", "Guy");

        guy1.getFirstName();
        guy1.getMiddleName();
        guy1.getLastName();
        StaticClasses.setFullName(StaticClasses.getFullName());

        System.out.println(guy1);
    }
}
