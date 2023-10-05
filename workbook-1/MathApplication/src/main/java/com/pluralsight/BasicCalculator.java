package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanText = new Scanner(System.in);

        System.out.println("Enter your first integer: ");
        double num1 = scanText.nextInt();
        //            ^this scans the text for an integer I put in, then saves the integer i put in as "num1"


        System.out.println("Enter your second integer: ");
        double num2 = scanText.nextInt();
// after entering a #, theres extra whitespace leftover

        scanText.nextLine();
        // ^this get rid of extra white space so the next scanner doesnt take it as an answer
        System.out.println("Which calculation will you choose?");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Choose a letter in the parenthesis:");
        String answer = scanText.nextLine();

        char a = answer.charAt(0);
        // ^go into string(array of characters) and return the character of the index of 0
        // single quotes are for char. only
        // double quotes are exclusively for strings

        if (a == 'a' || a == 'A') {
            double sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (a == 's' || a == 'S') {
            double difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        } else if (a == 'm' || a == 'M') {
            double product = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + product);
        } else if (a == 'd' || a == 'D') {
            double solution = num1 / num2;
            System.out.println(num1 + "/" + num2 + " = " + solution);
        } else{
            System.out.println("reread the instructions bro");
        }
    }
}

