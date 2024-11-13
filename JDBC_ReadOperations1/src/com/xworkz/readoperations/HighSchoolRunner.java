package com.xworkz.readoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class HighSchoolRunner {

    public static void main(String[] args) {
        try (
            Connection connection = DriverManager.getConnection(
                    ConnectionConstants.URL.getValue(),
                    ConnectionConstants.USERNAME.getValue(),
                    ConnectionConstants.PASSWORD.getValue());
                java.sql.Statement statement = connection.createStatement();
        ) {

            try (ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1())) {
                while (resultSet1.next()) {
                    System.out.println(resultSet1.getString("name"));
                }
            }
            System.out.println("###############################");

            try (ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2())) {
                while (resultSet2.next()) {
                    System.out.println(resultSet2.getString("name"));
                }
            }
            System.out.println("###############################");

            try (ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3())) {
                while (resultSet3.next()) {
                    System.out.println(resultSet3.getString("YOP"));
                }
            }
            System.out.println("###############################");

            try (ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4())) {
                while (resultSet4.next()) {
                    System.out.println(resultSet4.getString("email"));
                    System.out.println(resultSet4.getString("password"));
                }
            }
            System.out.println("###############################");

            try (ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5())) {
                while (resultSet5.next()) {
                    System.out.println(resultSet5.getString("email"));
                    System.out.println(resultSet5.getString("password"));
                }
            }
            System.out.println("###############################");

            	try (ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6())) {
                while (resultSet6.next()) {
                    System.out.println(resultSet6.getString("name"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
