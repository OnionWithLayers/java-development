package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders {
    public static void main(String[] args) throws ClassNotFoundException {

        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.pluralsight.UsingDriverManager <username> <password>");
            System.exit(1);
        }

        // get the username and password from the command line args
        String username = args[0];
        String password = args[1];

        // load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

       /* Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("1) Display all products");
        System.out.println("2) Display all customers");
        System.out.println("3) Display all categories");
        System.out.println("4) Exit");
        System.out.println("Select and option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

       /* try(// create the connection and prepared statement
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    "root",
                    "thisismypassword1"
            );
        ){
*/

        switch (option) {
            case 1:

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                        username,
                        password
                );
                     PreparedStatement preparedStatement = connection.prepareStatement("""
                             SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                             FROM products
                             """);

                     ResultSet resultSet = preparedStatement.executeQuery();
                ) {
                    while (resultSet.next()) {
                        int productId = resultSet.getInt("ProductID");
                        String productName = resultSet.getString("ProductName");
                        double unitPrice = resultSet.getDouble("UnitPrice");
                        int unitsInStock = resultSet.getInt("UnitsInStock");

                        System.out.println("Product ID: " + productId);
                        System.out.println("Product Name: " + productName);
                        System.out.println("Unit Price: " + unitPrice);
                        System.out.println("Units In Stock: " + unitsInStock);
                        System.out.println("-----------------------------------------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;

            case 2:

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);

                     PreparedStatement preparedStatement = connection.prepareStatement("SELECT CompanyName, ContactName FROM customers");

                     ResultSet resultSet = preparedStatement.executeQuery();
                ) {

                    while (resultSet.next()) {
                        String companyName = resultSet.getString("CompanyName");
                        String contactName = resultSet.getString("ContactName");

                        System.out.println("Company Name: " + companyName);
                        System.out.println("Contact Name: " + contactName);
                        System.out.println("-----------------------------------------");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 3:

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);
                     PreparedStatement preparedStatement = connection.prepareStatement("SELECT CategoryID, CategoryName FROM northwind.categories");
                     ResultSet resultSet = preparedStatement.executeQuery();
                ) {
                    while (resultSet.next()) {
                        String categoryId = resultSet.getString("CategoryID");
                        String categoryName = resultSet.getString("CategoryName");

                        System.out.println("Category ID: " + categoryId);
                        System.out.println("Category Type: " + categoryName);
                        System.out.println("-----------------------------------------");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            case 4:
                break;
        }
    }
}