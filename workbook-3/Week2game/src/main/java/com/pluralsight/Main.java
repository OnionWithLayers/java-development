package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character character = new Character("Hero", 30, 10);
        System.out.println("\nInitial Player Status:\n " + character.getFullStatus());

        System.out.println("=================================");
        System.out.println(character.getDescription() + " has encountered enemies!");

        Enemy[] enemies = new Enemy[5];
        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy("Enemy " + (i + 1), (int) (Math.random() * 30 + 5));
            System.out.println(enemies[i].getName() + " has "
                    + enemies[i].getHealth() + " health and "
                    + enemies[i].getDamage() + " attack damage.");
        }

        battle(character, enemies);

        System.out.println("\nBattle ended. Stats:\n" + character.getFullStatus());
      /*  Character character = new Character("Mike");
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

        System.out.println("=====================\nThe character's status:\n" + character.getFullStatus());
        System.out.println("=====================\nEnemy status:\n" + enemy.getEnemyStatus() + "=====================");
*/
    }

    public static void battle(Character player, Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            System.out.println("==========================================");
            System.out.println(player.getDescription() + " vs " + enemy.getName());
            while (player.getHealth() > 0 && enemy.getHealth() > 0) {
                if (Math.random() > 0.5) {
                    player.attack(enemy);
                    System.out.println(player.getDescription() + " attacked " + enemy.getName() +
                            " with regular attack. " + enemy.getName() + " health is now " + enemy.getHealth());
                } else {
                    player.attack(enemy, 1.5);
                    System.out.println(player.getDescription() + " attacked " + enemy.getName() +
                            " with a weapon multiplier! " + enemy.getName() + " health is now " + enemy.getHealth());
                }
                if (enemy.getHealth() <= 0) {
                    System.out.println(enemy.getName() + " has been defeated!");
                    break;
                }
                if (Math.random() > .5) {
                    enemy.attack(player);
                    System.out.println(enemy.getName() + " attacked " + player.getDescription() +
                            " with regular attack. " + player.getDescription() + " health is now " + player.getHealth());
                } else {
                    enemy.attack(player, 1.25);
                    System.out.println(enemy.getName() + " attacked " + player.getDescription() +
                            " with a weapon multiplier. " + player.getDescription() + " health is now " + player.getHealth());
                }
                if (player.getHealth() <= 0) {
                    System.out.println(player.getDescription() + " has been defeated!\n\tGAME OVER");
                    break;
                }
            }
        }

    }
}
