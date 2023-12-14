package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("User and pass are needed!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource sakilaDataSource = new BasicDataSource();
        sakilaDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        sakilaDataSource.setUsername(username);
        sakilaDataSource.setPassword(password);

/*        insertIntoDirect(sakilaDataSource);
        insertIntoWithGeneratedKeys(sakilaDataSource);
        updateRecord(sakilaDataSource);*/
        deleteRecord(sakilaDataSource);
    }

    public static void insertIntoDirect(DataSource dataSource){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO country (country) VALUES (?);"))
        {
            preparedStatement.setString(1, "MashedPotato");

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows updated: " + rows);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertIntoWithGeneratedKeys(DataSource dataSource) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO country (country) VALUES (?);",
                     Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, "PotatoSalad");

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows updated: " + rows);

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                while (keys.next()) {
                    //you can also use 'getInt' herev getLong is just for big #s
                    System.out.println("A new key was added: " + keys.getLong(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public static void updateRecord(DataSource datasource){
            try(Connection connection = datasource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE film_text " +
                    "SET description = ? WHERE film_id = ?");
            ){
                preparedStatement.setString(1, "Apache Devine is an Apache " +
                        "Project that delivers messages to different brokers " +
                        "without care as to what technology it is");
                preparedStatement.setLong(2, 31);

                int rows = preparedStatement.executeUpdate();
                System.out.println("Rows updated: " + rows);
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

    public static void deleteRecord(DataSource datasource){
        try(Connection connection = datasource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM country " +
                    "WHERE country = ?");
        ){
            preparedStatement.setString(1, "MashedPotato");

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + rows);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

}
