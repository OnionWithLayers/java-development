package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex");
        Child child = new Child("Charlie", "lego");
        SoftballPlayer softballPlayer = new SoftballPlayer("Jordan", "WildCats");
        Violinist violinist = new Violinist("Casey", "Stradivarius");



        //Test play method

        person.play();
        child.play();
        softballPlayer.play();
        violinist.play();

    }
}
