package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        if (args.length != 2) {
            System.out.println("We need a username and password to run the app");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Class.forName("com.mysql.cj.jdbc.Driver");

        try ( Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sakila",
                "root",
                "thisismypassword1");

              PreparedStatement preparedStatement = connection.prepareStatement("""
                            SELECT first_name, last_name
                            FROM customer
                            WHERE last_name LIKE ? ORDER BY first_name
                            """
              );
        ) {

        /*Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root",
                    "thisismypassword1"
            );


            preparedStatement = connection.prepareStatement(
                    """
                            SELECT first_name, last_name
                            FROM customer
                            WHERE last_name LIKE ? ORDER BY first_name
                            """
            );*/
            // set the parameters for the prepared statement
            preparedStatement.setString(1, "Sa%");

            // execute the query - also declare the ResultSet within a try-with-resources block
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ){
                //loop thru the results
                while (resultSet.next()){
                    // process the data
                    System.out.println("First Name: " + resultSet.getString("first_name"));
                    System.out.println("Last Name: " + resultSet.getString("last_name"));
                    System.out.println("===================================================");
                }
            }

/*

            while (resultSet.next()) {
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
                System.out.println("===================================================");
            }
*/


        } catch (SQLException e) {
            //this will catch all SQLExceptions occuring in the block including those in nested try statements
            e.printStackTrace();
        } /*finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}