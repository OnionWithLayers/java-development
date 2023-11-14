package com.pluralsight;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        String hi = NameFormatter.format("Potator", "Soup");
        System.out.println(hi);

        String yo = NameFormatter.format("", "Jon", "Sue",
                "Doe", "");
        System.out.println(yo);

        System.out.println(NameFormatter.format("Mel Ody"));
        System.out.println(NameFormatter.format("Mel Music Ody, PhD"));
        System.out.println(NameFormatter.format("Dr. Mel Music Ody PhD"));
    }
}
