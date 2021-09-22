package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private static Connection conn = null;

    public static String password;
   public static String username;
  public static String dbUrl;

    public static Connection getConnection() {

        try {
            conn = DriverManager.getConnection(dbUrl, username, password);
            if (conn != null) {

            }
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }

        return conn;

    }
}

