package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + "!");

        System.out.println("How many hours have you worked?");
        float hours = scanner.nextFloat();
        System.out.println("haha, L.");

        System.out.println("Now what is your pay rate?");
        float payRate = scanner.nextFloat();

        float grossPay = hours * payRate;

        if (grossPay > 2000){
            System.out.println("Your gross pay will be $" + grossPay + "...");
        }else{
            System.out.println("YOUR GROSS PAY IS ONLY $" + grossPay + "??!?? AHAHAHAHHAHA");

        }
    }
}

