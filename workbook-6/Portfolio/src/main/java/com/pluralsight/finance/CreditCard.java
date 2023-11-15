package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void pay(){
        balance -= balance;
    }
    public void deposit(){
        balance += balance;
    }
    public void creditCard(String name, String accountNumber, double balance){
        System.out.println("Name: " + name + " | " + "account number: " + accountNumber +
                " | balance: " + balance);
    }

    @Override
    public double getValue(){
        return balance;
    }
}
