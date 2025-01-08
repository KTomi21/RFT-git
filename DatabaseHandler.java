package com.example.szamologep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseHandler {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/rft";
    private static final String USER = "tomi";
    private static final String PASSWORD = "tomi";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("MySQL JDBC Driver nem található!");
        }
    }


}
