package com.pluralsight.db;

import com.pluralsight.models.Actors;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actors> getActorsByName(String lastName) {
        List<Actors> actorsList = new ArrayList<>();

        String actorsQuery = "SELECT first_name, last_name, actor_id FROM actor WHERE last_name = ?";
        // Use try-with-resources to automatically close the connection and statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement actorsStatement = connection.prepareStatement(actorsQuery)) {
            actorsStatement.setString(1, lastName);
         {

            // Execute query to retrieve actors with the provided last name


            try (

                try (ResultSet actorsResult = actorsStatement.executeQuery()) {
                    if (actorsResult.next()) {
                        System.out.println("Your matches are: \n");
                        do {
                            int actorId = actorsResult.getInt("actor_id");
                            String firstName = actorsResult.getString("first_name");
                            lastName = actorsResult.getString("last_name");
                            System.out.println(firstName + " " + lastName);

                            Actors actors = new Actors(actorId, firstName, lastName);
                            actorsList.add(actors);
                        } while (actorsResult.next());
                    } else {
                        System.out.println("No matches!");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorsList;
    }
/*

    public List<Actors> getActorsByFirstName(Scanner scanner, Actors actors){

        // Ask the user for a first name and last name of an actor
        System.out.print("\nEnter the first name of an actor: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name of an actor: ");
        lastName = scanner.nextLine();
        return null;
    }

*/




}