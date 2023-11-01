package com.pluralsight;

public class StaticClasses {
    public static String fullName;
    private String firstName;
    private String middleName;
    private String lastName;

    public StaticClasses(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public static String getFullName() {
        return fullName;
    }

    public static void setFullName(String fullName){
        StaticClasses.fullName = fullName;
    }
}
