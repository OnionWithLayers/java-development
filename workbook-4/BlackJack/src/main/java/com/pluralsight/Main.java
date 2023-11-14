package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of Player 1: ");
        String player1 = scanner.nextLine();
        System.out.println("Enter name of Player 2: ");
        String player2 = scanner.nextLine();


        Deck deck = new Deck();
        deck.shuffle();
        Card bjCard = deck.deal();

        String winner = "";

        Hand p1Hand = new Hand();
        p1Hand.Deal(bjCard);
        p1Hand.Deal(bjCard);

        Hand p2Hand = new Hand();
        p2Hand.Deal(bjCard);
        p2Hand.Deal(bjCard);

        System.out.println(player1 + "'s hand: ");
        p1Hand.Print();

        System.out.println(player2 + "'s hand: ");
        p2Hand.Print();

        int p1Points = p1Hand.getValue();
        int p2Points = p2Hand.getValue();

        if(p1Points > p2Points){
            winner = player1;
            System.out.println(winner);
        } else if (p2Points > p1Points) {
            winner = player2;
            System.out.println(winner);
        }else{
            System.out.println("It's a tie");
        }
        scanner.close();
    }
}
