package com.pluralsight;

public class ArrayList {
    public static void main(String[] args) {

        //OLD WAY
        String[] kids1 = {"Nathalie", "Brittany", "Zachary"};

        System.out.println("the first element is: " + kids1[0]);
        for(String kid: kids1){
            System.out.println(kid);
        }
        //OR
       /* for (int i = 0; i < kids1.length; i++){
            System.out.println(kids1[i]);
        }*/

        System.out.println("\nNow this is the new way:\n");

        //NEW WAY
        java.util.ArrayList<String> kids = new java.util.ArrayList<>();

        kids.add("Nathan");
        kids.add("Bruno");
        kids.add("Sam");

//      THIS PRINTS IN BRACKETS
        System.out.println(kids);

        //THIS PRINTS IN DIFF LINES
        for (int i = 0; i < kids.size(); i++) {
            System.out.println(kids.get(i));
        }


        System.out.println("ArrayList after updating index 1:");
        kids.set(1, "Ray");
        System.out.println(kids);
        System.out.println("===================");


        System.out.println("ArrayList after Removing \"Nathan\" or index 0:");
        kids.remove(0);
        System.out.println(kids);
        System.out.println("===================");

        System.out.println("ArrayList after adding \"John\"");
        kids.add("John");
        System.out.println(kids);
    }
}
