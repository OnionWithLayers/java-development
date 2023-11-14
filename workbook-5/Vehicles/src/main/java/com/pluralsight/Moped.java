package com.pluralsight;

public class Moped extends Vehicles {
    private int maxWeight;


    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void ride(){
        System.out.println("riding moped yay");
    }
}
