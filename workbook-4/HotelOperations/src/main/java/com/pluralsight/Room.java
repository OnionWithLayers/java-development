package com.pluralsight;

public class Room {
    private int NumOfBeds;
    private double Price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        NumOfBeds = numOfBeds;
        Price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        NumOfBeds = numOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room info:\n" +
                "NumOfBeds: " + NumOfBeds +
                "\nPrice: " + Price +
                "\nisOccupied: " + isOccupied +
                "\nisDirty: " + isDirty +
                "\nisAvailable: " + isAvailable;
    }
}
