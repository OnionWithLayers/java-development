package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Room room = new Room(2, 30, true, true, true);
        Reservation reservation = new Reservation("King", 400, 3, true, 2);
        Employee employee = new Employee("1", "Jack", "Basic Deparment", 25, 50);
        System.out.println(room);
        System.out.println("==========");
        System.out.println(reservation);
        System.out.println("==========");
        System.out.println(employee);
    }
}
