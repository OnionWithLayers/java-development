package com.pluralsight;

public class Reservation {
    private String RoomType;
    private double Price;
    private int NumOfNights;
    private boolean isWeekend;
    private int ReservationTotal;

    public Reservation(String roomType, double price, int numOfNights, boolean isWeekend, int reservationTotal) {
        RoomType = roomType;
        Price = price;
        NumOfNights = numOfNights;
        this.isWeekend = isWeekend;
        ReservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getNumOfNights() {
        return NumOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        NumOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getReservationTotal() {
        return ReservationTotal;
    }

    public void setReservationTotal(int reservationTotal) {
        ReservationTotal = reservationTotal;
    }

    @Override
    public String toString() {
        return "Reservation: \n" +
                "RoomType: " + RoomType +
                "\nPrice: " + Price +
                "\nNumOfNights: " + NumOfNights +
                "\nisWeekend: " + isWeekend +
                "\nReservationTotal: " + ReservationTotal;
    }
}
