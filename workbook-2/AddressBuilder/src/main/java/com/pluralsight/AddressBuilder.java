package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //just like how you make a Scanner object, make a StringBuilder object

        System.out.println("Please provide the following information:");
        System.out.println("Full Name: ");
        String answer = scanner.nextLine().trim();
        System.out.println("Billing Street");
        String answer2 = scanner.nextLine().trim();
        System.out.println("Billing City: ");
        String answer3 = scanner.nextLine().trim();
        System.out.println("Billing State: ");
        String answer4 = scanner.nextLine().trim();
        System.out.println("Billing Zip: ");
        String answer5 = scanner.nextLine().trim();
        System.out.println("Shipping Street: ");
        String answer6 = scanner.nextLine().trim();
        System.out.println("Shipping City: ");
        String answer7 = scanner.nextLine().trim();
        System.out.println("Shipping State: ");
        String answer8 = scanner.nextLine().trim();
        System.out.println("Shipping Zip: ");
        String answer9 = scanner.nextLine().trim();

        StringBuilder addressInfo = new StringBuilder();

        //now, use ".append" to add more strings to the StringBuilder object
        addressInfo.append("Full Name: " + answer);
        addressInfo.append("\nBilling Street: " + answer2);
        addressInfo.append("\nBilling City: " + answer3);
        addressInfo.append("\nBilling State: " + answer4);
        addressInfo.append("\nBilling Zip: " + answer5);
        addressInfo.append("\nShipping Street: " + answer6);
        addressInfo.append("\nShipping City: " + answer7);
        addressInfo.append("\nShipping State: " + answer8);
        addressInfo.append("\nShipping Zip: " + answer9);

        String prompts = addressInfo.toString();
        System.out.println(prompts);

    }
}
