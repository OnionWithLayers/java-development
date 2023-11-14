package com.pluralsight;

public class SemiTruck extends Vehicles{
    private int numberOfTrailers;


    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    protected void loadCargo(){
        System.out.println("semi-truck loading cargo...");
    }
    protected void unloadingCargo(){
        System.out.println("semi-truck unloading cargo...");
    }
}
