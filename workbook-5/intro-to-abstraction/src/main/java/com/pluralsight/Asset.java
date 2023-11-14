package com.pluralsight;

//  turn a class into an 'abstract class' by putting the word 'abstract' before 'class'
public abstract class Asset {
    protected String description;
    protected int yearAcquired;
    protected double originalCost;

    public Asset(String description, int yearAcquired, double originalCost) {
        this.description = description;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearAcquired() {
        return yearAcquired;
    }

    public void setYearAcquired(int yearAcquired) {
        this.yearAcquired = yearAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    //for a 'abstract' method, once it's created in the parent class, it's NEEDED IN ALL CHILD CLASSES
    // also, it doesn't need any {} at the end. just having a semicolon is enough bc now every child class needs it
    public abstract double getValue();

}
