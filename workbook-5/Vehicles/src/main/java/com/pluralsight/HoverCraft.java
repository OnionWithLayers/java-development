package com.pluralsight;

public class HoverCraft extends Vehicles{
private int airCushionPressure;

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    protected void hover(){
        System.out.println("hovercraft hovering woooooooooh");
    }
}
