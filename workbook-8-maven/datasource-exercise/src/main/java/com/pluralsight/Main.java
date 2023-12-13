package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Username and password are required for usage!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

    }

    public static void doSimpleQuery(BasicDataSource dataSource) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT first_name, last_name FROM customer " + "WHERE last_name LIKE ? ORDER BY first_name");
            ){
            preparedStatement.setString(1, "Sa%");
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                while(resultSet.next()){
                    System.out.println("First Name: " + resultSet.getString(1));
                    System.out.println("Last Name: " + resultSet.getString(2));
                    System.out.println("===========================================");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
