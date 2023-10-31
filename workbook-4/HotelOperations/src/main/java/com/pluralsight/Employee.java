package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeID;
    private String Name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


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

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }

    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double totalPay() {
        return (getRegularHours() * payRate) +
                (getOvertimeHours() * (payRate * 1.5));
    }

    public void punchIn(double time) {
        startTime = time;
    }

    public void punchOut(double time) {
        double duration = time - startTime;
        hoursWorked += duration;
        startTime = 0;
    }

    public void punchTimeCard(double time) {
        if (startTime == 0) {
            startTime = 0;
        } else {
            double duration = time - startTime;
            hoursWorked += duration;
            startTime = 0;
        }
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        double time = hour + (min / 60);
        startTime = time;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        double time = hour + (min / 60);
        double duration = time - startTime;
        hoursWorked += duration;
        startTime = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", Name='" + Name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
