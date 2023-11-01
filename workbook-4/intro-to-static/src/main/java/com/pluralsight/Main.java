package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("109", "Bob", 75);
        BankAccount acct2 = new BankAccount("45", "Susan", 1000);

        acct1.deposit(1000);
        acct2.withdraw(500);

        //sets interest rate for all objects to 0.045
        BankAccount.setInterestRate(0.045);

        /*wont rlly work bc the interestRate is static: it'll change everything
        acct1.setInterestRate(0.023);
        */
        System.out.println(BankAccount.getInterestRate());

       /*these values will be the same bc of static interestRate
       System.out.println(acct1.getInterestRate());
        System.out.println(acct2.getInterestRate());*/
    }
}
