package com.pluralsight.database;

import com.pluralsight.model.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private BasicDataSource dataSource;

    public DataManager(String url, String username, String password) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    public void insertShipper(String shipperName, String phone) {
        try (Connection connection = dataSource.getConnection();            // if unsure ab SQL syntax, go to a new query
             // on SQLWorkbench and right click the table
             //                                                                and send to SQLEditor
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?);",
                     Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, shipperName);
            preparedStatement.setString(2, phone);

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows updated: " + rows);

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                while (keys.next()) {
                    System.out.println("A new key was added. This data's key value is: " + keys.getLong(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Shipper> getListOfShippers() {
        List<Shipper> shippers = new ArrayList<>();

        String shipperListQuery = "SELECT * FROM shippers";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(shipperListQuery)) {

            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                while (resultSet.next()) {
                    System.out.println("List of Shippers");

                    do {
                        int shipperId = resultSet.getInt(1);
                        String companyName = resultSet.getString(2);
                        String phone = resultSet.getString(3);

                        Shipper shipper = new Shipper(shipperId, companyName, phone);

                        shippers.add(shipper);
                    } while (resultSet.next());

                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shippers;
    }

    public void updateShipperPhone(int shipperId, String phoneNum) {
        String updateQuery = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            // changes the '?' next to Phone to the variable phoneNum
            preparedStatement.setString(1, phoneNum);
            // changes the '?' next to ShipperID to the variable shipperId
            preparedStatement.setInt(2, shipperId);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteShipper(int deleteId) { //DON'T DELETE FIRST 3 COMPANIES. IT WILL CAUSE PROBLEMS
        String deleteQuery = "DELETE FROM shippers WHERE ShipperID = ?";

        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);){
            preparedStatement.setInt(1, deleteId);

                int rows = preparedStatement.executeUpdate();
                System.out.println("Rows deleted: " + rows);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
