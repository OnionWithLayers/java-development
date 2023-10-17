package com.pluralsight;

public class Enemy {
    private String name;
    private int health = 100;
    private int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public Enemy(String name){
        this.name = name;
        this.damage = 30;
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
        this.health = Math.max(health, 0);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Character character){
        int damageDone = this.damage;
        int updatedHP = character.getHealth() - damageDone;
        character.setHealth(updatedHP);
        System.out.println("You've dealt " + damageDone + " damage to " + character.getName() + "!");
    }

    public void attack(Character character, double weaponMultiplier){
        int damageDone = (int) (this.damage * weaponMultiplier);
        int updatedHP = character.getHealth() - damageDone;
        character.setHealth(updatedHP);
        System.out.println("With the weapon multiplier, you've dealt " + damageDone + " damage to " + character.getName() + "!");
    }
}
