package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //instead of '.add' you can preload the List with info with 'Arrays.asList'
        List<String> states = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California");
        String letter = "C";
        List<String> matchingStates =
                states // Source - Data at Rest
                        .stream().filter(state -> state.startsWith(letter)) // Data Transformation
                        .collect(Collectors.toList()); // Destination - Data at Rest


        matchingStates.forEach(state -> System.out.println(state));


        System.out.println("==================================================");


        List<String> titles = Arrays.asList("Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        List<String> matching = titles
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .collect(Collectors.toList());

        matching.forEach(title -> System.out.println(title));


        System.out.println("=========================================");


        //count()
        System.out.println("Count Method: ");
        System.out.println();
        List<String> titles2 = Arrays.asList("Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        long count = titles2
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .count();

        System.out.println("The count is: " + count);


        System.out.println("=================================");


        // forEach()
        System.out.println("forEach Method: ");
        System.out.println();

        List<String> titles3 = Arrays.asList(
                "Halloween 3", "Ghost", "Halloween",
                "Friday the 13th", "Twister", "Halloween 2");

        titles3.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .forEach(System.out::println);


        System.out.println("=====================================================");


        // sorted()
        System.out.println("Sorted Method: ");
        System.out.println();

        List<String> titles4 = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        titles4.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .sorted()
                .forEach(System.out::println);


        System.out.println("==================================================");


        // reverseOrder()
        System.out.println("ReverseOrder Method: ");
        System.out.println();

        List<String> titles5 = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        titles5.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .sorted((Comparator.reverseOrder()))
                .forEach(System.out::println);


        System.out.println("======================================");


        //map()
        System.out.println("Map Method: ");
        System.out.println();

        List<Integer> numbers = Arrays.asList(3, 2, 5, 1, 8, 7 ,9);

        List<Integer> squaresList = numbers
                .stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(squaresList);


        System.out.println("===================================");
        System.out.println("Map Method as a forLoop");
        System.out.println("(this is the same thing as a MapMethod stream. Just as a forLoop)");
        System.out.println();

        List<Integer> number2 = Arrays.asList(3, 2, 5, 1, 8, 7 ,9);

        List<Integer> squaresList2 = new ArrayList<>();

        for(Integer num : number2){
            squaresList2.add(num * num);
        }

        System.out.println(numbers);
        System.out.println(squaresList2);

        System.out.println("========================================");

        //reduce()
        System.out.println("Reduce Method: ");
        System.out.println();

        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 2, 3, 4, 7, 5);

        int sum = numbers2.stream()
                .reduce(0,
                        (temp, num) -> temp += num);

        System.out.println("The sum is: " + sum);


    }
}
