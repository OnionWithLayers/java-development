package com.pluralsight;

public class Animal {

    //public Dog() constructor calls on this with 'super()'
    public Animal(){
        System.out.println("I'm in the constructor of the Parent (Animal)");
    }

    //public Dog(name, breed) constructor calls on this with 'super(name)'
    public Animal(String name){
        this.name = name;
        System.out.println("I'm in the constructor of the Parent (animal) with Name");
    }
    protected String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
