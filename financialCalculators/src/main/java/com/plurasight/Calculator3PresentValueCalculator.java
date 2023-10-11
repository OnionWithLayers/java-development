package com.plurasight;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator3PresentValueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //$3000
        System.out.println("Enter your monthly payout: ");
        double monthlyPayment = scanner.nextDouble();

        //20
        System.out.println("Enter the years to pay out: ");
        int years = scanner.nextInt();

        //2.5
        System.out.println("Enter your expected interest rate: ");
        double interestRate = scanner.nextDouble();
        double realInterestRate = interestRate / 12 / 100;

        double presentValue = monthlyPayment * ((1 - (Math.pow(1 + realInterestRate, (-years * 12)))) / realInterestRate);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Your present value is: " + formatter.format(presentValue));
    }
}
