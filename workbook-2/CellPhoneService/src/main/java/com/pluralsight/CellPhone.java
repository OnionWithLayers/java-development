package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;

    public CellPhone() {
    }

    public CellPhone(int serialNum, String model, String carrier, String phoneNum, String owner) {

        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;
    }

    //GETTERS
    public int getSerialNum() {
        return serialNum;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getOwner() {
        return owner;
    }

    //SETTERS
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
