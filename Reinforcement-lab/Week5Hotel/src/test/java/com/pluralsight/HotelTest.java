package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void getTotalBookings_ThreeBookings_Expect3TotalBookings(){
        //Arrange
        Room room1 = new Room(102, "Double");
        Room room2 = new Room(103, "Suite");
        Room room3 = new Room(104, "Single");

        Guest guest1 = new Guest("John Smith", 20);
        Guest guest2 = new Guest("Alpha", 20);
        Guest guest3 = new Guest("Beta", 20);

        room1.bookRoom(guest1);
        room2.bookRoom(guest2);
        room3.bookRoom(guest3);

        //Act
        int actualTotalBookings = Hotel.getTotalBookings();

        //Assert//
        assertEquals(3, actualTotalBookings, "Total bookings should match the number of booked rooms");
    }

}