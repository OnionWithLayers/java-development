package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//public class Payroll {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the name of the payroll file to create: ");
//        String outputFileName = scanner.nextLine();
//
//        if(!outputFileName )
//        String fileName = "employees.csv";
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] tokens = line.split("\\|");
//                int id = Integer.parseInt(tokens[0]);
//                String name = tokens[1];
//                double hoursWorked = Double.parseDouble(tokens[2]);
//                double payRate = Double.parseDouble(tokens[3]);
//
//                Employee employee = new Employee(id, name, hoursWorked, payRate);
//
//                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
//                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
//            }
//        } catch (IOException e) {
//            System.err.println("Error reading file: " + fileName);
//        }
//    }
//}