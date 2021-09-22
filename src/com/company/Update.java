package com.company;

import java.sql.*;

public class Update {

    public Connection connection = null;

    public void updateCategory() {
        try {
            connection = Connections.getConnection();

            Statement statement = connection.createStatement();
            new Select().conditionalSelect();
            int rowsUpdated = statement.executeUpdate("Update production.categories set category_name = 'Lada-KaLina' where category_id = 59 ");
            if (rowsUpdated > 0) {
                System.out.println("The category name (nr. 59, Nisan) was updated successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        new Select().conditionalSelect();
    }
}




