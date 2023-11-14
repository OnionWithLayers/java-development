package com.pluralsight;

public class Child extends Person{
    private String favoriteToy;

    public Child(String name, String favoriteToy) {
        super(name);
        this.favoriteToy = favoriteToy;
    }

    //@Override SHOULD ALWAYS BE PUT.    it isn't needed, but it's BEST PRACTICE TO DO IT.
    //                                    it helps other devs too who are working on it.
    @Override
    public void play(){
        System.out.println(name + " (a child) is playing with " + favoriteToy);
    }
}
