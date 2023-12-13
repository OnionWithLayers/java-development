package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", 20);
        Person person2 = new Person("Dharr", "Man", 38);
        Person person3 = new Person("Rock", "Lee", 23);
        Person person4 = new Person("Amanda", "Chiang", 20);
        Person person5 = new Person("Nico", "Robin", 35);
        Person person6 = new Person("Luffy", "Monkey", 19);
        Person person7 = new Person("That", "Guy", 22);
        Person person8 = new Person("Just", "Him", 25);
        Person person9 = new Person("That", "Him", 30);
        Person person10 = new Person("Jacqueline", "Tsunami", 32);

        List<Person> people;
        people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person you're looking for: ");
        String searchName = scanner.nextLine().trim();
/*

        List<Person> matchedPerson;
        for (Person person : people) {
            if (searchName.equalsIgnoreCase(person.getFirstName()) || searchName.equalsIgnoreCase(person.getLastName())) {
                matchedPerson = new ArrayList<>();
                matchedPerson.add(person);
                System.out.println(matchedPerson);
            }
        }
*/

        //saving the return from 'searchName' to a new list called 'searchPotato'
        List<Person> searchedPotato = searchName(people, searchName);


        double avgAge = avgAge(people);

        int minAge = findOldestAge(people);
        int maxAge = findYoungestAge(people);

        System.out.println("The average age is: " + avgAge);
        System.out.println("The minimum age is: " + minAge);
        System.out.println("The maximum age is: " + maxAge);

        System.out.println("=================================================");

    }


    //parameters need the 'people list', and the scanner 'String searchName'
    public static List<Person> searchName(List<Person> people, String searchName) {
        /*

        List<Person> matchedPerson;
        for (Person person : people) {
            if (searchName.equalsIgnoreCase(person.getFirstName()) || searchName.equalsIgnoreCase(person.getLastName())) {
                matchedPerson = new ArrayList<>();
                matchedPerson.add(person);
                System.out.println(matchedPerson);
            }
        }
*/

        //new list of Person 'people' is original source which is why it's 'people.stream'
        List<Person> matchingPeople = people
                // dont need to call its type, just the variable name after the '->' should be the condition
                .stream().filter(searchPerson -> searchPerson.getLastName().equalsIgnoreCase(searchName))
                //collects the data and stores it into the 'matchingPeople' list
                .collect(Collectors.toList());

        //this prints out each element in its own line
        matchingPeople.forEach(person -> System.out.println(person));
        System.out.println("====================================");
        //this prints out the list as a whole
        return matchingPeople;
      /*  //this is new list for Person for my search
        List<Person> matchingPerson = new ArrayList<>();
        for(Person searchPerson : people){
            if(searchPerson.getLastName().equalsIgnoreCase(searchName)){
                matchingPerson.add(searchPerson);
            }
        }*/
    }

    public static double avgAge(List<Person> people) {
        /*int averageAge = 0;
        for (int i = 0; i < people.size(); i++) {
            averageAge = (people.get(i).getAge() + people.get(i).getAge()) / people.size();

        }
        return (double) averageAge;*/

        List<Person> numbers = people;
                int sum = numbers.stream()
                .reduce(0, (temp, number) -> temp += number);
        double average = sum / people.size();
        return average;
    }


    public static int findOldestAge(List<Person> people){
        /*
           *//* we set the maxAge to the minimum value so you can check if the person.age is
        greater than the variable we can set it as the new maxAge*//*
        //MIN_VALUE is made by java, and it's the lowest possible int there is in java
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        System.out.println("The max age is: " + maxAge);

*/

        List<Integer> sortedAges = people.stream().map(Person::getAge).sorted().collect(Collectors.toList());

        int maxAge = sortedAges.get(sortedAges.size() - 1);
        return maxAge;
    }

    public static int findYoungestAge(List<Person> people){
        /*
        //MAX_VALUE is the highest possible int there is in java
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        System.out.println("The min age is: " + minAge);
*/

        List<Integer> sortedAges = people.stream().map(Person::getAge).sorted().collect(Collectors.toList());

        int minAge = sortedAges.get(0);
        return minAge;
    }
}
