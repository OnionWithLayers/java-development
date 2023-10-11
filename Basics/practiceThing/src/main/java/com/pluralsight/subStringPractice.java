package com.pluralsight;

import java.util.Scanner;

public class subStringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //for ex. the product code is ACME-12213
        System.out.println("Enter the product code: ");
        String productCode = scanner.nextLine();

        //this statement below finds the "index", or position of "-"
        int dash = productCode.indexOf("-");
        System.out.println("the index of \"-\" is " + dash);

        //this statement will take whatever variable you put into it and will start from whatever index you put in
        //the ending index is exclusive, not inclusive
        //bc i started the substring at "0", it'll include the first char, but the ending index is exclusive, so it won't include the "-" on the output
        String vendor = productCode.substring(0, dash); //i put "dash" instead of the int 4 bc earlier i made a variable for the dash symbol already
        System.out.println(vendor);

        //now let's try to get "ME-12"
        String me = productCode.substring(2, 7);
        System.out.println(me);

        //now lets try to only get the part after "-", so the 12213
        String num = productCode.substring(dash +1); //we do the +1 bc the starting substring is inclusive, so we do +1 to start after the dash
        //you could also do: String num = productCode.substring(dash +1, productCode.length());

        System.out.println(num);
    }
}
