package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        HoverCraft hoverCraft = new HoverCraft();
        Moped moped = new Moped();
        SemiTruck semiTruck = new SemiTruck();

        car.startEngine();
        car.openTrunk();

        moped.startEngine();
    }
}
