package com.pluralsight;

public class SoftballPlayer extends Person{
    private String teamName;

    public SoftballPlayer(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void play(){
        System.out.println(name + " (a softball player) is playing for the " + teamName);
    }
}
