package com.pluralsight;

public class ConvertingStringToNumber {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "8";

        //this converts the String variables num1 and num2 into integers
        int numInt1 = Integer.parseInt(num1);
        int numInt2 = Integer.parseInt(num2);

        //This wont add correctly bc it's treating the variables as string, not integers
        System.out.println(num1 + num2);
        //This will add correctly bc it's treating the variables as integers
        System.out.println(numInt1 + numInt2);
    }
}
