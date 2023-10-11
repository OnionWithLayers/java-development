package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ". I see that you are " + age + " years old.");

        if (age >= 18) {
            System.out.println("This means that you are eligible to vote!");
        } else{
            System.out.println("Aren't you a little too young to vote?");
        }
    }
}
