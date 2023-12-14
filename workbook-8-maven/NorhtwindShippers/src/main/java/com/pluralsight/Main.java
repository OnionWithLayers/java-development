package com.pluralsight;

import com.pluralsight.database.DataManager;
import com.pluralsight.model.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Username and password are required to run!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];
        String url = "jdbc:mysql://localhost:3306/northwind";

        DataManager dataManager = new DataManager(url, username, password);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the company name of the shipper you want to add: ");
        String shipperName = scanner.nextLine();

        System.out.println("What's the phone # of the shipper you want to add: ");
        String shipperPhone = scanner.nextLine();

        //INSERTING A NEW SHIPPER
        dataManager.insertShipper(shipperName, shipperPhone);

        //LISTING SHIPPERS
        List<Shipper> shippingList = dataManager.getListOfShippers();
        for (Shipper shipperList : shippingList){
            System.out.println(shipperList);
        }

        System.out.println("What's the ID of the shipper's phone number you want to change: ");
        int shipperId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What would you like to change the phone number to? ");
        String phoneNum = scanner.nextLine();

        //UPDATING THE SHIPPER PHONE NUM
        dataManager.updateShipperPhone(shipperId, phoneNum);

        //LISTING THE UPDATED LIST
        shippingList.clear();
        shippingList = dataManager.getListOfShippers();
        for (Shipper shipperList : shippingList){
            System.out.println(shipperList);
        }

        System.out.println("Enter the Shipper ID of the shipper you want to delete: ");
        int deleteId = scanner.nextInt();

        dataManager.deleteShipper(deleteId);
    }
}
