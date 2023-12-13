package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ray", "Maroun", 40));
        employees.add(new Employee("John", "Doe", 20));
        employees.add(new Employee("Jane", "Doe", 30));


        String lastName = "Maroun";

        List<Employee> matchingEmps =
                employees // Source - Data at Rest
                        //.stream turns into stream   .filter makes you return boolean of the list of whats inside (), if
                        //                              true, it returns it as the new stream it uses
                        .stream().filter(p -> p.getLastName().equals(lastName)) // Data Transformation - Data is in transit
                        //collects the stream and saves it as a List
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


        System.out.println(avgAge(employees));
        System.out.println(oldestAge(employees));
        System.out.println(youngestAge(employees));


    }


    public static double avgAge(List<Employee> people) {
        /*int averageAge = 0;
        for (int i = 0; i < people.size(); i++) {
            averageAge += (people.get(i).getAge());
        }
        int realAvgAge = averageAge / people.size();
        return (double) realAvgAge;
*/
//                                                                           'temp' is variable 'num' is the element
        int totalAge = people.stream().map(p -> p.getAge()).reduce(0, (temp, num) -> temp += num);
        return (double) totalAge / people.size();
    }

    public static double oldestAge(List<Employee> employee) {

        List<Employee> sortedEmployees = employee.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).collect(Collectors.toList());
        int oldestPerson = sortedEmployees.get(0).getAge();
        return oldestPerson;
    }

    public static double youngestAge(List<Employee> employee) {

        List<Employee> sortedEmployees = employee.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        int youngin = sortedEmployees.get(0).getAge();
        return youngin;
    }
}