package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Now I use the new class "Car" that I just made as a class
        Car newCar = new Car("red", 2000,
                "Mercedes", "C300", 2000.00);
        Car oldCar = new Car("Black", 1840,
                "Honda", "Accord", 2000.00);

        /*I can only refer to the specific attribute inside the new class if I set the class
        to PUBLIC. The color and year attribute is set to "private" which is why it
        wont work if I call for it*/
        System.out.println("The color of the first car is: " + newCar.getColor());
        System.out.println("The year of the first car is: " + newCar.getYear());
        /* to gain access to the specific attribute, we make a new public method to call
        the private method, and since the new method is public, we could use it.
        basically we need to make a middle-man
         */

        //now let's say
        newCar.setColor("Blue");

        System.out.println("the color of the first car after the update is: " + newCar.getColor());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the title of the book: ");
        String titleFromTheUser = scanner.nextLine();

        System.out.println("Please enter the number of pages of the book: ");
        int numOfPagesFromTheUser = scanner.nextInt();
        scanner.nextLine(); /*when moving from scanning int to scanning lines,
                        you need to add an extra scanner.nextLine(); as a buffer
                        or else it might skip your code */

        System.out.println("Please enter the author of the book: ");
        String authorFromTheUser = scanner.nextLine();

        System.out.println("Please enter the year of the book: ");
        int yearFromTheUser = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the type of the book cover: ");
        String typeFromTheUser = scanner.nextLine();

        System.out.println("Please enter the genre of the book: ");
        String genreFromTheUser = scanner.nextLine();

        System.out.println("Please enter the price of the book: ");
        double priceFromTheUser = scanner.nextDouble();

//        Book newBook = new Book(titleFromTheUser, numOfPagesFromTheUser, authorFromTheUser,
//                yearFromTheUser, typeFromTheUser, genreFromTheUser, priceFromTheUser);

        Book newBook = new Book();
        newBook.setTitle(titleFromTheUser);
        newBook.setNumOfPages(numOfPagesFromTheUser);
        newBook.setAuthor(authorFromTheUser);
        newBook.setYear(yearFromTheUser);
        newBook.setType(typeFromTheUser);
        newBook.setGenre(genreFromTheUser);
        newBook.setPrice(priceFromTheUser);


        System.out.println("The title of this book is: " + newBook.getTitle());

    }
}
