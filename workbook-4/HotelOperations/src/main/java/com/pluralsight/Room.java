package com.pluralsight;

public class Room {
    private int NumOfBeds;
    private double Price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numOfBeds, double price) {
        NumOfBeds = numOfBeds;
        Price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable(){
        return !isOccupied && !isDirty;
    }

}
