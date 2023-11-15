package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(4);
        numbers.add(5);
//        numbers.add(92);


        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());
    }

}
