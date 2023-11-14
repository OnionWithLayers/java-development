package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky", "Husky");

        System.out.println("The name of the dog is: " + dog1.getName());

        System.out.println("================================");

        Dog dog2 = new Dog();
    }
}
