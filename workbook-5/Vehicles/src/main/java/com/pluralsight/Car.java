package com.pluralsight;

public class Car extends Vehicles{
    private int numberOfDoors;

    public Car(String model, String color, int topspeed, int fuelCapacity, int cargoCapacity){
        super Vehicles;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    protected void openTrunk(){
        System.out.println("car trunk open");
    }
    protected void closeTrunk(){
        System.out.println("car trunk closed");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
