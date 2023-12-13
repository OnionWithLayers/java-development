package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("You need the username and password to run this");
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        getAllProducts(basicDataSource);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Product ID: ");
        int productId = scanner.nextInt();
        getProductById(basicDataSource, productId);

    }

    public static void getAllProducts(BasicDataSource basicDataSource) {
        String productQuery = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

        try (Connection connection = basicDataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(productQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                System.out.println("Product ID: " + resultSet.getString(1));
                System.out.println("Product Name: " + resultSet.getString(2));
                System.out.println("Unit Price: " + resultSet.getString(3));
                System.out.println("Units In Stock: " + resultSet.getString(4));
                System.out.println("======================================================");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getProductById(BasicDataSource basicDataSource, int productId){
        String productByIdQuery = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products WHERE ProductID = ?";
        try(Connection connection = basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(productByIdQuery);
                ){
            preparedStatement.setInt(1, productId);
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while(resultSet.next()){
                    System.out.println("Product ID: " + resultSet.getString(1));
                    System.out.println("Product Name: " + resultSet.getString(2));
                    System.out.println("Unit Price: " + resultSet.getString(3));
                    System.out.println("Units In Stock: " + resultSet.getString(4));
                    System.out.println("======================================================");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
