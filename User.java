package com.example.szamologep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void saveToDatabase() {
        String url = "jdbc:mysql://localhost:3306/rft";
        String user = "tomi";
        String pass = "tomi";

    }
}
