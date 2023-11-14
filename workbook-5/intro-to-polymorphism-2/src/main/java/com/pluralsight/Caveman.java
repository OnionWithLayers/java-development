package com.pluralsight;

public class Caveman extends Human{
    private String weapon;

    public Caveman(String name, int age, String weapon) {
        super(name, age);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void eat(){
        System.out.println("Me hunt lion and eat!");
    }

    @Override
    public void walk(){
        System.out.println("I am caveman and walk barefoot");
    }
}
