package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your serial number: ");
        int serialNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your model type: ");
        String model = scanner.nextLine().trim();

        System.out.println("Please enter your carrier: ");
        String carrier = scanner.nextLine().trim();

        System.out.println("Please enter your phone number: ");
        String phoneNum = scanner.nextLine().trim();

        System.out.println("Please enter the owner name: ");
        String owner = scanner.nextLine().trim();

        //System.out.println("Your serial number is: " + serialNum);


        CellPhone newCellPhone = new CellPhone(serialNum, model, carrier, phoneNum, owner);

        //now that we set the SerialNum to the variable "serialNum" that we got from the user's input
        newCellPhone.setSerialNum(serialNum);
        newCellPhone.setModel(model);
        newCellPhone.setCarrier(carrier);
        newCellPhone.setPhoneNum(phoneNum);
        newCellPhone.setOwner(owner);

        //now we print the statement by using a getter to "get" the new "set" value you put in for each variabel
        System.out.println("Your serial number is: " + newCellPhone.getSerialNum());
        System.out.println("Your phone's model is: " + newCellPhone.getModel());
        System.out.println("Your phone's carrier is: " + newCellPhone.getCarrier());
        System.out.println("Your phone number is: " + newCellPhone.getPhoneNum());
        System.out.println("The name of the phone's owner is: " + newCellPhone.getOwner());


//        CellPhone testCellPhone = new CellPhone();
//        testCellPhone.setSerialNum(10);
//        System.out.println(testCellPhone.getSerialNum());

    }
}
