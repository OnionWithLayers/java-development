package com.plurasight;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator2FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //deposit is $1000
        System.out.println("Enter your deposit:");
        int deposit = scanner.nextInt();

        //interest rate 1.75%
        System.out.println("Enter your interest rate:");
        double interestRate = scanner.nextDouble();
        double realInterestRate = interestRate / 100;

        //5 years
        System.out.println("Enter your number of years:");
        int years = scanner.nextInt();

        double futureValue = deposit * Math.pow((1 + realInterestRate), years);
        String formattedFutureValue = NumberFormat.getCurrencyInstance().format(futureValue);
        System.out.println("Your Future Value will be: " + formattedFutureValue);

        double totalInterestEarned = futureValue - deposit;
        String formattedTotalInterestEarned = NumberFormat.getCurrencyInstance().format(totalInterestEarned);
        System.out.println("You have earned " + formattedTotalInterestEarned + " in interest");
    }
}
