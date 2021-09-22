package com.company;
import java.sql.*;

public class Delete {

    public Connection connection = null;

    public void crudDelete() {
        try {

            connection = Connections.getConnection();
            new Select().conditionalSelect();

            String sql = "delete from production.categories where category_id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "59");
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The category (nr. 59) was deleted successfully!");
            }
}
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        new Select().conditionalSelect();
    }
}




