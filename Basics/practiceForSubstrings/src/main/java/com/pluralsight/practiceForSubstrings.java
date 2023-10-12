package com.pluralsight;

import java.util.Scanner;

public class practiceForSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gryffindor:Slytherin|21:9
        System.out.println("Enter the score: ");
        String score = scanner.nextLine().trim();

        int colonPosition = score.indexOf(':');
        int secondColonPosition = score.lastIndexOf(':');
        int pipePosition = score.indexOf("|");

        String team1 = score.substring(0, colonPosition);
        String team2 = score.substring(colonPosition + 1, pipePosition);
        String score1 = score.substring(pipePosition + 1, secondColonPosition);
        String score2 = score.substring(secondColonPosition + 1);

        int scoreA = Integer.parseInt(score1);
        int scoreB = Integer.parseInt(score2);

        System.out.println("Team 1 is " + team1);
        System.out.println("Team 2 is " + team2);

        System.out.println("The score for " + team1 + " is: " + score1);
        System.out.println("The score for " + team2 + " is: " + score2);

        if (scoreA > scoreB) {
            System.out.println("\n" + team1 + " WINS THE HOUSE CUP!!!");
        } else if (scoreA < scoreB) {
            System.out.println("\n Shitter- *cough cough* - 'scuse me, " + team2 + " wins the house cup.");
        } else {
            System.out.println("\n" + team1 + " and " + team2 + " are tied.");
        }

    }
}
