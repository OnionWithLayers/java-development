package com.pluralsight;

public class splitStrings {
    public static void main(String[] args) {
        String input = "Dallas|Ft. Worth|Austin";

        String[] cities = input.split("\\|");
    }
}
