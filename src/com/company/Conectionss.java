package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectionss {
    public static Connection getConnection() {
        String dbUrl = "jdbc:sqlserver://localhost;database=BikeStores";
        String username= "sa";
        String password= "Vsevolod25";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, username , password );
            if (conn != null) {
                System.out.println("Connected");
            }
        } catch (
                SQLException ex) {
            ex.printStackTrace();
       }

       return conn;
    }
}

