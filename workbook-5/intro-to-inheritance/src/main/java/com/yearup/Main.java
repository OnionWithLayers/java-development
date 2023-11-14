package com.yearup;

import com.pluralsight.Animal;
import com.pluralsight.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("Lucky");
        System.out.println(animal1.getName());

        Dog dog1 = new Dog();
        dog1.setBreed("Corgi");
        dog1.setName("Ruby");
        dog1.setEnergy(50);
        System.out.println(animal1.getName());
        System.out.println(dog1.getName());


    }
}
