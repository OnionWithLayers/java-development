package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();

        System.out.println("Please enter your serial number: ");
//        we need to get the info first before we "set" it to something, which is why
//        the scanner is before the setter
        int serialNum = scanner.nextInt();
        cellPhone1.setSerialNum(serialNum);
        scanner.nextLine();

        System.out.println("Please enter your model type: ");
        String model = scanner.nextLine().trim();
        cellPhone1.setModel(model);

        System.out.println("Please enter your carrier: ");
        String carrier = scanner.nextLine().trim();
        cellPhone1.setCarrier(carrier);

        System.out.println("Please enter your phone number: ");
        String phoneNum = scanner.nextLine().trim();
        cellPhone1.setPhoneNum(phoneNum);

        System.out.println("Please enter the owner name: ");
        String owner = scanner.nextLine().trim();
        cellPhone1.setOwner(owner);

//        System.out.println("Who are you dialing?");
//        String phoneParameter = scanner.nextLine().trim();
//        cellPhone1.setDial(phoneParameter);
        //System.out.println("Your serial number is: " + serialNum);

        //now make a SECOND PHONE
        CellPhone cellPhone2 = new CellPhone();

        System.out.println("Please enter your serial number: ");
//        we need to get the info first before we "set" it to something, which is why
//        the scanner is before the setter
//        this phone code does NOT need the variable type (String, int, double, etc) bc
//        it's already defined in the earlier cellPhone1 code
        serialNum = scanner.nextInt();
        cellPhone2.setSerialNum(serialNum);
        scanner.nextLine();

        System.out.println("Please enter your model type: ");
        model = scanner.nextLine().trim();
        cellPhone2.setModel(model);

        System.out.println("Please enter your carrier: ");
        carrier = scanner.nextLine().trim();
        cellPhone2.setCarrier(carrier);

        System.out.println("Please enter your phone number: ");
        phoneNum = scanner.nextLine().trim();
        cellPhone2.setPhoneNum(phoneNum);

        System.out.println("Please enter the owner name: ");
        owner = scanner.nextLine().trim();
        cellPhone2.setOwner(owner);

        //now we print the statement by using a getter to "get" the new "set" value you put in for each variabel
        System.out.println("Your serial number is: " + cellPhone1.getSerialNum());
        System.out.println("Your phone's model is: " + cellPhone1.getModel());
        System.out.println("Your phone's carrier is: " + cellPhone1.getCarrier());
        System.out.println("Your phone number is: " + cellPhone1.getPhoneNum());
        System.out.println("The name of the phone's owner is: " + cellPhone1.getOwner());

        /*this code sends the info you got from cellPhone1 and cellPhone2
        and sends it to the method "display" */
        display(cellPhone1);
        display(cellPhone2);

        System.out.println(cellPhone1.getOwner() + "'s phone is dialing " + cellPhone2.getDial());
        System.out.println(cellPhone2.getOwner() + "'s phone is dialing " + cellPhone1.getDial());

    }
    public static void display(CellPhone phone) {
        System.out.println("Your serial number is: " + phone.getSerialNum());
        System.out.println("Your phone's model is: " + phone.getModel());
        System.out.println("Your phone's carrier is: " + phone.getCarrier());
        System.out.println("Your phone number is: " + phone.getPhoneNum());
        System.out.println("The name of the phone's owner is: " + phone.getOwner());
        System.out.println(phone.getOwner() + "'s phone is dialing " + phone.getDial());
    }

}
