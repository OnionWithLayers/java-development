package com.pluralsight;

public class Violinist extends Person{
    private String violinType;

    public Violinist(String name, String violinType) {
        super(name);
        this.violinType = violinType;
    }

    @Override
    public void play(){
        System.out.println(name + " (a violinist) is playing a " + violinType);
    }
}
