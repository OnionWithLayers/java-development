package com.pluralsight;

public class NewPerson {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isEmployed;

    public NewPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isAdult(){
        return age > 18;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "this new person's firstName is " + firstName + "\n" +
                "their last name is " + lastName + "\n" +
                "and age: " + age;
    }
}
