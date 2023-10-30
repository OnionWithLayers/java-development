package com.pluralsight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> kids = new ArrayList<>();

        HashMap<String, String> statesAndCapitals = new HashMap<>();
//                            "Key", "Value"     you need to args in the parenthesis
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        //Even if you put in the keys in a specific way, the hashmap will re-arrange the
        //info in a way that the hashmap itself likes
        System.out.println(statesAndCapitals);

  /*      tryna get the value based on the key that you have
        System.out.println(statesAndCapitals.get("TX"));*/
/*
        String value = statesAndCapitals.get("TX");
        if (value != null) {
            System.out.println(value);
        } else {
            System.out.println("This key is not valid");
        }

        //you can .remove by just the key
        statesAndCapitals.remove("CA");
        System.out.println(statesAndCapitals);

        statesAndCapitals.clear();
        System.out.println(statesAndCapitals);*/

//prints out an array of only the values
        System.out.println(statesAndCapitals.values());

        for(String value : statesAndCapitals.values()){
            System.out.println(value);
        }

        System.out.println("===========");

        //gives all the keys alone and puts it in an array
        for(String key: statesAndCapitals.keySet()){
            //".get(key)" gets the value
            //so this statement is saying the "key : values"
            System.out.println(key + ": " + statesAndCapitals.get(key));
        }
    }
}
