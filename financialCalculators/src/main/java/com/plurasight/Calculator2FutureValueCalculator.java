package com.plurasight;

import java.util.Scanner;

public class Calculator2FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your deposit:");
        int deposit = scanner.nextInt();

        System.out.println("Enter your interest rate:");
        double interestRate = scanner.nextDouble();
        double realInterestRate = interestRate / 100;

        System.out.println("Enter your number of years:");
        int years = scanner.nextInt();

        double futureValue = deposit * Math.pow((1 + realInterestRate), years);
        System.out.println("Your Future Value will be: " + futureValue);

        double totalInterestEarned = futureValue - deposit;
        System.out.println("You have earned " + totalInterestEarned + "in interest");
    }
}
