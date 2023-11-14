package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setEnergy(50);

        //cant print bc this is protected so non-children class cant access it
//        System.out.println(dog.bark());
    }
}
