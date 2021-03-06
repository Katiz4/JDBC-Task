package com.company;

import java.sql.*;

public class Select {

   public Connection connection = null;
    public void baseSelect() {

            try {
            connection = Connections.getConnection();
            String sql = "SELECT top 100 * FROM sales.customers order by customer_id desc ";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getInt("customer_id") + ", " + result.getString("first_name") + ","
                        + result.getString("last_name") + " " + result.getString("phone") + " " + result.getString("email")
                        + " " + result.getString("street") + " " + result.getString("city") + " " + result.getString("zip_code"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void conditionalSelect() {
        try {
            connection = Connections.getConnection();
            String sql = "SELECT category_id, category_name from production.categories where category_id between 55 and 65";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getInt("category_id") + ", " + result.getString("category_name"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

