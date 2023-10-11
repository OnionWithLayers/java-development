package com.pluralsight;

public class trackingCode {
    public static void main(String[] args) {
        String trackingCode = "USA-12981-Y-22";

        char letter = trackingCode.charAt(8);
        //finds out what character is at spot 8
        System.out.println(letter);


        String productCode = "ACME-12213";

        int dashPosition = productCode.indexOf("-");
        //finds the index-position of "-" and stores it as an int variable called dashPosition
        String vendor = productCode.substring(0, dashPosition);
        //finds the substring(int, beginningIndex) of productCode and stores it as a String variable called "vendor", substring is everything from position "0" to dashPosition
        System.out.println(vendor);
        String number = productCode.substring(0, dashPosition + 1);
        // this will find the substring from position "0" to the position right after "dashPosition"
        System.out.println(number);
    }
}
