package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;

        if(roomType.equalsIgnoreCase("king")){
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){ //getPrice is the name of the subclass, so I can call it later
             //totalPrice is to assign what the total price is
        double totalPrice = pricePerNight * numOfNights;

        if(isWeekend){
            totalPrice = totalPrice * 1.1;     //or totalPrice *= 1.1;
        }
        return totalPrice;
    }
    public double getReservationTotal(){
        return getPrice();
    }
}
