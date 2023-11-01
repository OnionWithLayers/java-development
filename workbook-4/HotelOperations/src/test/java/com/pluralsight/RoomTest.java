package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_MakeRoomOccupiedAndDirty() {
        //arrange
        Room room = new Room(1, 50);

        //act
        room.checkIn();
        //assert
        boolean actualAvailability = room.isAvailable();
        assertFalse(actualAvailability);
    }

    @Test
    public void checkOut_should_makeIsOccupiedFalse() {
        //arrange
        Room room = new Room(1, 50);
        room.checkIn();

        //act
        room.checkOut();
        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanroom_should_turnAnUnoccupiedRoomClean() {
        //arrange
        Room room = new Room(1, 50);
        //room is now occupied and dirty
        room.checkIn();

        //since i checked out, it should be not occupied and dirty
        room.checkOut();

        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
    }

    @Test
    public void checkIn_RoomWasPreviouslyUsed_RoomIsNotOccupied(){
        //arrange
        Room room = new Room(5, 50);
        room.checkIn();
        room.checkOut();
        //act
        room.checkIn();
        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_RoomIsOccupied_RoomRemainsDirty(){
        //arrange
        Room room = new Room(5, 50);
        room.checkIn();

        //act
        room.cleanRoom();

        //assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }
}