package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("John", 40);
        Caveman caveman = new Caveman("Paul", 25, "Club");
        ModernPerson modernPerson = new ModernPerson("Raymond", 40, "Gucci");

        human.eat();
        caveman.eat();
        modernPerson.eat();

        System.out.println("============================");

        Human human1;

        human1 = new Caveman("paul", 35, "Club");

        human1 = new ModernPerson("Ray", 35, "Suit");

        Human h = new Human("Jack", 40);
        feed("Human", h);
        move(h);

        Caveman c = new Caveman("Paul", 25, "Club");
        feed("Caveman", c);
        move(c);

        ModernPerson m = new ModernPerson("Raymond", 40, "Gucci");
        feed("Modern Person", m);
        move(m);

        System.out.println("====================================");

        ArrayList<Human> people = new ArrayList<>();

        people.add(h);
        people.add(c);
        people.add(m);

        for (int i = 0; i < people.size(); i++) {
                    // checks if the object matches whatever you put after 'instanceof'
            if (people.get(i) instanceof Human) {
                System.out.println("This is a Human");
            }
            if (people.get(i) instanceof Caveman) {
                System.out.println("This is a Caveman");
            }
            if (people.get(i) instanceof ModernPerson) {
                System.out.println("This is a Modern Person");
            }
            System.out.println();
        }

        for (int j = 0; j < people.size(); j++){
                                                        //getSimpleName helps print out the Class as a String
            System.out.println(people.get(j).getClass().getSimpleName());
        }

        if (h instanceof Object){
            System.out.println("Potato");
        }
    }


    public static void feed(String label, Human human) {
        System.out.println(label + "-->");
        human.eat();
    }

    public static void move(Human human) {
        System.out.println("I am moving");
        human.walk();
    }

}
