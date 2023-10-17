package com.pluralsight;

import javax.naming.Name;

public class Character {
    private String name;
    private int health;
    private int strength;
    private int agility;

    public Character(String name, int strength, int agility) {
        this.health = 100;
        this.name = name;
        this.strength = strength;
        this.agility = agility;
    }

    public Character(String name) {
        this.health = 100;
        this.strength = 30;
        this.agility = 30;
        this.name = name;
        //the code below is another way of doing it. the 'this' refers to the class above, and then you fill in the parameters to match
//        this(name, 30, 10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
/*        if (health < 0) {
            health = 0;
        }
        this.health = health;*/
        //OR:
        this.health = Math.max(health, 0);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getDescription(){
        return name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
    }

    public String getHealthStatus(){
        return health + "HP";
    }
    public String getFullStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getDescription()).append("\n");
        sb.append("Health Status: ").append(getHealthStatus()).append("\n");
        sb.append("Strength: ").append(strength).append("\n");
        sb.append("Agility: ").append(agility).append("\n");

        return sb.toString();
    }

    public void attack(Enemy enemy){
        int damageDone = this.strength;
        int updatedHP = enemy.getHealth() - damageDone;
        enemy.setHealth(updatedHP);
        System.out.println("You've dealt " + damageDone + " damage to " + enemy.getName() + "!");
    }

    public void attack(Enemy enemy, double weaponMultiplier){
        int damageDone = (int) (this.strength * weaponMultiplier);
        int updatedHP = enemy.getHealth() - damageDone;
        enemy.setHealth(updatedHP);
        System.out.println("With the weapon multiplier, you've dealt " + damageDone + " damage to " + enemy.getName() + "!");
    }
}
