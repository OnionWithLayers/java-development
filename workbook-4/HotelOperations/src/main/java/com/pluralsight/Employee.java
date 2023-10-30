package com.pluralsight;

public class Employee {
    private int employeeID;
    private String Name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        Name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours(){
        if(hoursWorked <= 40){
            return  hoursWorked;
        } else {
            return 40;
        }

    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return  hoursWorked - 40;
        }else{
            return 0;
        }
    }
}
