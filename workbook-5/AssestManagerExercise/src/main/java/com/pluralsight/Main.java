package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        House house = new House("House", "2012", 20000, "1 Road",
                2, 3000, 40);
        House vacationHouse = new House("Apartment", "2015", 15000, "2 Road",
                3, 2000, 30);

        Vehicle vehicle1 = new Vehicle("Car", "April 2020", 30000, "Honda",
                2020, 2000);
        Vehicle vehicle2 = new Vehicle("2nd Car", "August 2022", 50000, "Accord",
                2022, 1500);


        ArrayList<Asset> assests = new ArrayList<>();

        assests.add(house);
        assests.add(vacationHouse);
        assests.add(vehicle1);
        assests.add(vehicle2);

        for (int i = 0; i < assests.size(); i++){
            System.out.println("Description: " + assests.get(i).getDescription());
            System.out.println("Date Acquired: " + assests.get(i).getDateAcquired());
            System.out.println("Original Cost: $" + assests.get(i).getOriginalCost());

            if(assests.get(i) instanceof House){
                //             the () is 'casting' where we force it to become a specific object so we can pull the info out for 'getAddress'
                House HOUSE = (House) assests.get(i);
                System.out.println("Address: " + house.getAddress());
            } else if (assests.get(i) instanceof  Vehicle) {
                Vehicle vehicle = (Vehicle) assests.get(i);
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }
            System.out.println("Value: $" + assests.get(i).getValue());
            System.out.println();
        }
    }
}
