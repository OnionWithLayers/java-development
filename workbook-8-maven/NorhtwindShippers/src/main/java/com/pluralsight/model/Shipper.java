package com.pluralsight.model;

public class Shipper {
    private int shipperId;
    private String companyName;
    private String phoneNum;

    public Shipper(int shipperId, String companyName, String phoneNum) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phoneNum = phoneNum;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "shipperId=" + shipperId +
                ", companyName='" + companyName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
