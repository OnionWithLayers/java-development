package com.pluralsight;

public class ReviewObjects {
    public static void main(String[] args) {
        //declare part          instatiate: give it value
        Person person1 = new Person("Raymond", 40);
        System.out.println(person1);

        System.out.println("==========");

        person1.setName("Bob");
        System.out.println(person1);

        System.out.println("===========");

        Person p2;
        p2 = new Person("Jack", 32);

        System.out.println(p2);

        System.out.println("===============");

        String name = "Mac";
        Person p3 = new Person(name, 24);
        System.out.println(p3);

        System.out.println("=================");

        Person p4,p5,p6;
        p4 = new Person("Amanda", 26);
        p5 = new Person("Joanne", 22);
        p6 = new Person("Jojo", 30);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        System.out.println("===========");

        Person[] fam = new Person[4];
        fam[0] = new Person("Banana", 100);
        System.out.println(fam[0]);

        System.out.println("Your name is " + p3.getName());

        System.out.println("---------------------");

        NewPerson newPerson1 = new NewPerson("Janna", "Lin", 22);
        System.out.println(newPerson1);
        System.out.println(newPerson1.getFullName() + " " + newPerson1.getAge());
    }
}
