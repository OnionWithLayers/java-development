package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    public void checkIn_GuestChecksIn_IsCheckedInTrue() {
        //Arrange
        Guest guest = new Guest("Alice Johnson", 25);

        //Act
        guest.checkIn();

        //Assert
        assertTrue(guest.isCheckedIn(), "It should be True if guest is checked in");
    }


    @Test
    public void checkOut_GuestChecksOut_IsCheckedInFalse(){
        //Arrange
        Guest guest = new Guest("Alice Johnson", 25);
        guest.checkIn();

        //Act
        guest.checkOut();

        //Assert
        assertFalse(guest.isCheckedIn(), "Guest should not be checked-in after the check-out operation");
    }
}