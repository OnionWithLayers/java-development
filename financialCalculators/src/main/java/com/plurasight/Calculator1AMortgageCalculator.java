package com.plurasight;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator1AMortgageCalculator {
    public static void main(String[] args) {
        Scanner scanText = new Scanner(System.in);

        System.out.println("Enter the principal:");
        double principal = scanText.nextDouble();
                // principal = 53000

        System.out.println("Enter interest rate:");
        double interestRate = scanText.nextDouble();
        double realInterestRate = interestRate / 12 / 100;
                // interestRate = 7.625

        System.out.println("Enter loan length:");
        int loanLength = scanText.nextInt();
        int months = loanLength * 12;
                // loan length = 15 years

        double monthlyPayment = (principal * realInterestRate * Math.pow((1 + realInterestRate), months)) / (Math.pow((1 + realInterestRate), months) - 1);
        double totalInterestPaid = (monthlyPayment * months) - principal;

        String formattedMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        String formattedTotalInterestPaid = NumberFormat.getCurrencyInstance().format(totalInterestPaid);

        System.out.println("Your monthly payment is: " + formattedMonthlyPayment);
        System.out.println("Your total interest is: " + formattedTotalInterestPaid);
    }
}





   /* Mortgage Calculator:
        Monthly Payment: monthlyPayment = (principal * interestRate * ((1 + interestRate)^months)) / (((1 + interestRate)^months) - 1)
        Total Interest Paid: totalInterest = (monthlyPayment * months) - principal
        Future Value Calculator:
        Future Value: futureValue = deposit * (1 + interestRate)^years
        Total Interest Earned: totalInterest = futureValue - deposit
        Present Value Calculator:
        Present Value: presentValue = monthlyPayout * ((1 - (1 + interestRate)^(-years*12)) / interestRate)
        :+1:
        7
        :white_check_mark:
        1
*/
