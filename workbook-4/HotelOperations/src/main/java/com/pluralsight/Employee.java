package com.pluralsight;

public class Employee {
    private String employeeID;
    private String Name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(String employeeID, String name, String department, double payRate, int hoursWorked) {
        this.employeeID = employeeID;
        Name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee: \n" +
                "employeeID: " + employeeID +
                "\nName: " + Name +
                "\ndepartment: " + department +
                "\npayRate: " + payRate +
                "\nhoursWorked: " + hoursWorked ;
    }
}
