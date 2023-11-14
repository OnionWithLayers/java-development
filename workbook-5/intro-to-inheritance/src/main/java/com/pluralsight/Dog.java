package com.pluralsight;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    //do 'protected' bc you want the other child-classes in the same package to have access to it
    //but you dont want other package classes to have access
    protected void bark(){
                         /*cannot just do 'name' bc 'name' is private in the Animal class,
                         so you do this.getName() instead, you have to use a getter
        System.out.println(this.getName() + "ruff ruff!");*/

      /*  *//*if you have the class parameter as 'protected', you *can* access the name attribute*//*
        System.out.println(name + " says ruff ruff!");*/

        if(isTired()){
            System.out.println("The dog is tired and can't bark");

        }else{
            System.out.println("bark bark");
        }
    }
}
