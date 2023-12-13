package com.pluralsight;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed){
//      'super' calls the parent constructor
//      'super' must be first in constructor
        super(name);
        this.breed = breed;

        System.out.println("I am in the constructor of the child (Dog) with name");
    }

    public Dog(){
        super();
        System.out.println("I am in the constructor of the child (Dog)");

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("ruff, ruff!");
    }
}
