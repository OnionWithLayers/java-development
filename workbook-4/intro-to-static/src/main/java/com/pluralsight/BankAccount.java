package com.pluralsight;

public class BankAccount {

    // Static Variable
    //used ONLY when you want one value for all object to be the same
    //ex: 5000 bank acc same interest rate
    private static double interestRate;

    // Instance Variables
    private String number;
    private String name;
    private double balance;

    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    // Instance Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Static Methods
    //static bc the variable it's using is static
    // if one is static, then all of them have to be static


    public static double getInterestRate() {
        return interestRate;
    }

    //user sets the interest rate
    public static void setInterestRate(double userInterestRate) {
        interestRate = userInterestRate;
    }
}