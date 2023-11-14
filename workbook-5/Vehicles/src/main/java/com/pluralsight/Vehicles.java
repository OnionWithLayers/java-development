package com.pluralsight;

public class Vehicles {
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int cargoCapacity;


    public Vehicles(){
        System.out.println("vroom");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void startEngine(){
        System.out.println("engine starting vroom vroom");
    }
    public  void stopEngine(){
        System.out.println("blegh. Engine stopped");
    }

    public void accelerate(){
        System.out.println("vrrr vrRRRR VROOOOM. engine accelerating");
    }
    public void brake(){
        System.out.println("SKKKKKRRRRRRRRTTTTTT. braking.");
    }

}
