package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ray", "Maroun", 40));
        employees.add(new Employee("John", "Doe", 20));
        employees.add(new Employee("Jane", "Doe", 30));


        String lastName = "Maroun";

        List<Employee> matchingEmps =
                employees // Source - Data at Rest
                        .stream().filter(p -> p.getLastName().equals(lastName)) // Data Transformation - Data is in transit
                        .collect(Collectors.toList()); // Destination - Data at Rest


/*        List<Employee> matchingEmps2 = new ArrayList<>();

        for (Employee p : employees) {
            if (p.getLastName().equals(lastName)) {
                matchingEmps2.add(p);
            }
        }*/

        System.out.println("The results are: ");

        /*for (Employee employee: matchingEmps){
            System.out.println(employee);
        }*/
            // ^ these are the same thing v
        matchingEmps.forEach(p -> {
            System.out.println(p);
        });

    }
}