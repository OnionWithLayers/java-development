package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.finance.Portfolio;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);

        //try to deposit money into both accounts
        account1.deposit(100);

        Jewelry shiny = new Jewelry("washing", 2000, 20);
        Portfolio port = new Portfolio("yearup", "guy");

        port.add(account1);
        port.add(shiny);
        /*cannot deposit amount into account 2 bc it was made using an implement first, and the
        implement doesn't have access to 'deposit', only getValue
         */

        System.out.println(port.getMostValuable());
        System.out.println(port.getLeastValuable());
        System.out.println(port.getValue());

    }
}
