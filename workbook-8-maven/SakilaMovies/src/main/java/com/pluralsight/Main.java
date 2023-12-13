package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        if (args.length != 2) {
            System.out.println("You need the username and password!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        try (Connection connection = dataSource.getConnection();
             Scanner scanner = new Scanner(System.in);) {

            System.out.println("Last name of the actor");
            String lastName = scanner.nextLine();

            String actorsQuery = "SELECT first_name, last_name FROM actor WHERE last_name = ?";
            try (PreparedStatement actorsStatement = connection.prepareStatement(actorsQuery);
            ) {
                // replaces the '?' in actorsQuery
                actorsStatement.setString(1, lastName);
                try (ResultSet actorsResult = actorsStatement.executeQuery()) {
                    if (actorsResult.next()) {
                        System.out.println("Your matches are: \n");
                        do {
                            String firstName = actorsResult.getString("first_name");
                            lastName = actorsResult.getString("last_name");
                            System.out.println(firstName + " " + lastName);

                        } while (actorsResult.next());
                    } else{
                        System.out.println("No matches >:(");
                    }
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        

    }
}

