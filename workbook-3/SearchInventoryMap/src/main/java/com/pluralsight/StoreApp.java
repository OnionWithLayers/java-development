package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
    // the key is the product id, the value is a product object

    //                      'Integer' is the non-primtive version of 'int'
    private static HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();

    static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }
}
