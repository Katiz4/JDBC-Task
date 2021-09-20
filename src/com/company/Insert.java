package com.company;

import java.sql.*;

public class Insert {

    public Connection connection = null;
    public void crudInsert() {
        try {
            connection = Conectionss.getConnection();
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate("SET IDENTITY_INSERT production.categories ON; insert into production.categories(category_id, category_name) values (59, 'Nisan')");
            if (rowsAffected > 0) {
                System.out.println("The data was updated successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

