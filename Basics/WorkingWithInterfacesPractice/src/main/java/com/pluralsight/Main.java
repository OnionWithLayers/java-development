package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jack", "Guy", 23);
        Person person2 = new Person("Joanna", "Gal", 23);
        Person person3 = new Person("Hannah", "Kang", 20);
        Person person4 = new Person("Jae", "Oh", 23);
        Person person5 = new Person("Mike", "Bale", 32);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);


        // better to define as a list first so that you can change the properties of the list wehnever you want
        List<String> names;
        names = new ArrayList<>();
        names = new LinkedList<>();
    }
}
