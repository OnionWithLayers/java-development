package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        //try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
        /*cannot deposit amount into account 2 bc it was made using an implement first, and the
        implement doesn't have access to 'deposit', only getValue
         */
    }
}
