package com.pluralsight;

import com.pluralsight.db.DataManager;
import com.pluralsight.models.Actors;
import com.pluralsight.models.Film;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("you need both the username and password");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];
        // Create a BasicDataSource
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        DataManager dataManager = new DataManager(dataSource);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the last name of an actor: ");
        String lastName = scanner.nextLine();

        List<Actors> actorsList = dataManager.getActorsByName(lastName);
        for (Actors actors : actorsList) {
            printActors(actors);
        }

        System.out.println("If you provide me the actor's ID, I will give you a list of movies they appeared in: ");
        int actorId = scanner.nextInt();

        List<Film> films = dataManager.getFilmsByActorsId(actorId);
        for(Film movie : films){
            System.out.println(movie);
        }
    }

    public static void printActors(Actors actors) {
        System.out.println("Actor ID: " + actors.getActorId());

    }


}