package com.company;
import java.sql.*;


public class BulkInsert {

        public Connection connection = null;

    public void crudBulkInsert() {
        try {
            connection = Connections.getConnection();
            new Select().baseSelect();

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate("SET IDENTITY_INSERT production.categories ON; BULK INSERT sales.customers FROM 'C:\\OtherPrograms\\bulkdata.csv' WITH  (FIRSTROW = 2, FIELDTERMINATOR = ',', ROWTERMINATOR='\n')");
            if (rowsAffected > 0) {
                System.out.println("==================================================================================");
                System.out.println("The bulk data from .csv file was inserted successfully!");
                System.out.println("==================================================================================");
            }
        } catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        new Select().baseSelect();
    }
}