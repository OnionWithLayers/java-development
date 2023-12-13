package com.pluralsight;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection;                                          //after '3306/', put in the database name. in this case, it's 'northwind'
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                "root",
                "thisismypassword1");

        //create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();

        //define the query from SQL
        //basically copy/paste the syntax you had in your SQLWorkbench here
        String query = "SELECT ProductName \n" +
                "FROM products\n" +
                "WHERE UnitsInStock > 0";

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        // process the results
        while (results.next()) {
            String productName = results.getString("ProductName");
            System.out.println(productName);
        }

        // 3. Close the connection
        connection.close();
    }
}
