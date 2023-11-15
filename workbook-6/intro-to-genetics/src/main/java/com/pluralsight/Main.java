package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // this no longer works bc 'Pair' class only extends Musician now
        /*Pair<Integer> twoNumbers = new Pair<>(63, 65);
        System.out.println(twoNumbers.getLeftThing());

        Pair<String> twoWords = new Pair<>("ME", "ME AGAIN!");
        System.out.println(twoWords.getRightThing());
        System.out.println("You thought it was someone special, but it was just " + twoWords.getRightThing());*/


        displayWithLabel("Name", "Dana");

        displayWithLabel("Age", 32);

        Pair<Musician> duets = new Pair<>(new Violinist("Ray", "Violin"),
                                        new Cellist("Bobby", "Cello"));
    }

    // T is a placeholder since you dont know what type it'll be
    static <T> void displayWithLabel(String label, T value) {
        System.out.println(label + ": " + value);
    }
}
