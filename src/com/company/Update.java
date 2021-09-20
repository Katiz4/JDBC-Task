package com.company;

import java.sql.*;

public class Update {

    public Connection connection = null;
    public void updateCategory() {
        try {
            connection = Conectionss.getConnection();
            Statement statement = connection.createStatement();

            int rowsUpdated = statement.executeUpdate("Update production.categories set category_name = 'Lada-Kalina' where category_id = 59 ");
            if (rowsUpdated > 0) {
                System.out.println("The data was updated successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}




