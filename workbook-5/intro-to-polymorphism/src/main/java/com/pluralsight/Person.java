package com.pluralsight;

public class Person {
    protected String name;

    public Person (String name){
        this.name = name;
    }

    public void play(){
        System.out.println(name + " (a person) is playing");
    }

}
