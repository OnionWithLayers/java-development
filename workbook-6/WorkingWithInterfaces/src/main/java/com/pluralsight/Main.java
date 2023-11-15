package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Jack", "Dill", 40));
        myFamily.add(new Person("Dave", "Quack", 23));
        myFamily.add(new Person("Steve", "MC", 14));
        myFamily.add(new Person("John", "Mike", 35));
        myFamily.add(new Person("Joanne", "Lol", 23));
        myFamily.add(new Person("Amanda", "Lick", 27));
        myFamily.add(new Person("Deina", "Yeager", 42));




        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person);
        }
    }
}
