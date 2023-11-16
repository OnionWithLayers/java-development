package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Person person9 = new Person("That", "Person", 30);
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

        List<Person> matchedPerson;
        for (Person person : people) {
            if (searchName.equalsIgnoreCase(person.getFirstName()) || searchName.equalsIgnoreCase(person.getLastName())) {
                matchedPerson = new ArrayList<>();
                matchedPerson.add(person);
                System.out.println(matchedPerson);
            }
        }


        int avgAge = (person1.getAge() + person2.getAge() + person3.getAge() + person4.getAge() + person5.getAge() +
                person6.getAge() + person7.getAge() + person8.getAge() + person9.getAge() + person10.getAge()) / people.size();
        double realAvgAge = avgAge;
        System.out.println("The average age of the 10 people is: " + realAvgAge);

           /* we set the maxAge to the minimum value so you can check if the person.age is
        greater than the variable we can set it as the new maxAge*/
            //MIN_VALUE is made by java, and it's the lowest possible int there is in java
        int maxAge = Integer.MIN_VALUE;
        for(Person person : people){
            if (person.getAge() > maxAge){
                maxAge = person.getAge();
            }
        }
            //MAX_VALUE is the highest possible int there is in java
        int minAge = Integer.MAX_VALUE;
        for (Person person : people){
            if (person.getAge() < minAge){
                minAge = person.getAge();
            }
        }

        System.out.println("The max age is: " + maxAge);
        System.out.println("The min age is: " + minAge);
    }
}
