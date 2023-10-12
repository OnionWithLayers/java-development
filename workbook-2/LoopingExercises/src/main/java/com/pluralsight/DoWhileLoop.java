package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("I love Java");
            i++;
        } while (i < 5);
        //this will still print the statement 5x bc
     //   it will "do" the statement to print first
        //   and then add the int
    }
}
