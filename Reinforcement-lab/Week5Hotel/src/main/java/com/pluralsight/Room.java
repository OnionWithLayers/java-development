package com.pluralsight;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean bookRoom(Guest guest){
        if(!(isOccupied)){
            guest.checkIn();
            isOccupied = true;
            Hotel.increaseTotalBookings();
            return true;
        }
        return false;
    }

    public void vacateRoom(){
        isOccupied = false;
        Hotel.decreaseTotalBookings();
    }

    public boolean isOccupied(Guest guest){
        if(!(isOccupied)){
            guest.checkIn();
            isOccupied = true;
            Hotel.increaseTotalBookings();
            return true;
        }
        return false;
    }
    public void vacateRoom(Guest guest){
        guest.checkOut();
        isOccupied = false;
        Hotel.decreaseTotalBookings();
    }
}
