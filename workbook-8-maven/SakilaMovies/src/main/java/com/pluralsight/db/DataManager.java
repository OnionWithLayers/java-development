package com.pluralsight.db;

import com.pluralsight.models.Actors;
import com.pluralsight.models.Film;

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

    public List<Film> getFilmsByActorsId(int actorsId) {
        String query = "SELECT film.film_id, title, description, release_year, length FROM film INNER JOIN film_actor ON film.film_id WHERE film_actor.actor_id = ?";
        List<Film> films = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1, actorsId);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    int filmId = resultSet.getInt(1);
                    String title = resultSet.getString(2);
                    String description = resultSet.getString(3);
                    int releaseYear = resultSet.getInt(4);
                    int length = resultSet.getInt(5);
                    Film film = new Film(filmId, title, description, releaseYear, length);
                    films.add(film);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return films;
    }

}