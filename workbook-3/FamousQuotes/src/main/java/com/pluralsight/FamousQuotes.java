package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] quotes = new String[10];

        quotes[0] = "A rose by any other name would smell as sweet. \tWilliam Shakespeare";
        quotes[1] = "Genius is one percent inspiration and ninety-nine percent perspiration.\tThomas Edison";
        quotes[2] = "Hell is other people.\tJean-Paul Sartre";
        quotes[3] = "If you are going through hell, keep going.\tWinston Churchill";
        quotes[4] = "Three can keep a secret, if two of them are dead.\tBenjamin Franklin";
        quotes[5] = "No one can make you feel inferior without your consent.\tEleanor Roosevelt";
        quotes[6] = "You must be the change you wish to see in the world.\tMahatma Gandhi";
        quotes[7] = "Whatever you are, be a good one.\tAbraham Lincoln";
        quotes[8] = "All the world’s a stage, and all the men and women merely players.\tWilliam Shakespeare";
        quotes[9] = "Doubt kills more dreams than failure ever will. \tSuzy Kassem.";
        while (true) {
            try {

                System.out.println("\nEnter a number 1-10 to see a quote!");
                int userInput = scanner.nextInt();
                scanner.nextLine();

                switch (userInput) {
                    case 1:
                        System.out.println(quotes[0]);
                        break;
                    case 2:
                        System.out.println(quotes[1]);
                        break;
                    case 3:
                        System.out.println(quotes[2]);
                        break;
                    case 4:
                        System.out.println(quotes[3]);
                        break;
                    case 5:
                        System.out.println(quotes[4]);
                        break;
                    case 6:
                        System.out.println(quotes[5]);
                        break;
                    case 7:
                        System.out.println(quotes[6]);
                        break;
                    case 8:
                        System.out.println(quotes[7]);
                        break;
                    case 9:
                        System.out.println(quotes[8]);
                        break;
                    case 10:
                        System.out.println(quotes[9]);
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Please follow directions");
                return;
            }
        }
    }
}