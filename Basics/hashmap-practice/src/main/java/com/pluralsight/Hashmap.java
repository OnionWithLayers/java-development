package com.pluralsight;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //makes sure the "H" and "M" are capital
        HashMap<Integer, String> people = new HashMap<>();
        //      < key,   value>
        //  ex:    ID,   person
        people.put(1, "Bob");
        people.put(2, "Alice");
        System.out.println(people);
    }
}
