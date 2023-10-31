package com.pluralsight;

import java.util.Scanner;

public class HotelOperations {
    public static void main(String[] args) {
        Room room = new Room(2, 30);
        Reservation reservation = new Reservation("King", 400, true);
        Employee employee = new Employee(1, "Jack", "Basic Department", 25, 50);
        System.out.println(room);
        System.out.println("==========");
        System.out.println(reservation);
        System.out.println("==========");
        System.out.println(employee);


        System.out.println("whats your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Employee employee1 = new Employee(1, name, "bad", 15, 20);
        System.out.println(employee1);


        employee1.punchIn();
    }
}
