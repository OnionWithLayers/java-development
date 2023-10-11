package com.pluralsight;

public class Book {

    private String title;
    private int numOfPages;
    private String author;
    private int year;
    private String type;
    private String genre;
    private double price;



    public Book(String title, int numOfPages, String author, int year, String type,
                String genre, double price) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.author = author;
        this.year = year;
        this.type = type;
        this.genre = genre;
        this.price = price;
    }

    public Book() {
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }
}

