package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class Conectionss {
  //private static String dbUrl = "jdbc:sqlserver://localhost;database=BikeStores";
  //  private String username = "sa";
    // private static String password = "Vsevolod25";

  private static Connection conn = null;

    public static String password;
   public static String username;
  public static String dbUrl;

    public static Connection getConnection() {

        try {
            conn = DriverManager.getConnection(dbUrl, username, password);
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

