package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // the key is the product id, the value is a product object

    //                      'Integer' is the non-primtive version of 'int'
    private static HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();

    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();

        boolean repeat = true;
        while (repeat) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What item # are you interested in? ");
            int id = scanner.nextInt();
            Product matchedProduct = inventory.get(id);
            if (matchedProduct == null) {
                System.out.println("We don't carry that product");
                return;
            }                    // "%s" is string    "%.2f" means to display the number with two digits after the decimal point.
            System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());


            System.out.println("\nDo you want to go again? (y.n): ");
            String answer = scanner.nextLine();

            repeat = answer.equalsIgnoreCase("y");

        }


    }

    public static void loadInventory(){
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("inventory.csv"));
            String input;

            while ((input = bufferedReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                Product product = new Product(id, name, price);
                inventory.put(id, product);
            }

        } catch (Exception e) {
            System.out.println("An error has occurred");
        }

    }
}

