package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Character character = new Character("Mike");
        Enemy enemy = new Enemy("Something");

        System.out.println("Something's HP before the attack: " + enemy.getHealth());

        character.attack(enemy);

        System.out.println("Something's HP after the attack: " + enemy.getHealth());

        character.attack(enemy, 1.5);
        System.out.println("Something's HP after the attack: " + enemy.getHealth());


        System.out.println("\n Mike's HP before the attack: " + character.getHealth());
        enemy.attack(character);
        System.out.println("Mike's HP after the attack: " + character.getHealth());
        enemy.attack(character, 1.5);
        System.out.println("Something's HP after the attack: " + character.getHealth());
    }
}
