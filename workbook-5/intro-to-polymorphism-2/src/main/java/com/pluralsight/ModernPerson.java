package com.pluralsight;

public class ModernPerson extends Human{
    private String clothing;

    public ModernPerson(String name, int age, String clothing) {
        super(name, age);
        this.clothing = clothing;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    @Override
    public void eat(){
        System.out.println("I'll go to McDonalds and eat!");
    }

    @Override
    public void walk(){
        System.out.println("I am a Modern Person and I am walking upright and with shoes");
    }
}
