package com.example.miniproject_wishlist.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private static String hostname;

    private static String username;

    private static String password;

    private static Connection conn;

    public static Connection getConn() {
        if(conn != null){
            return conn;
        }

        // add env variables to -maven runner under File menu AND Run configurations used
        hostname = System.getenv("azure_url");
        username = System.getenv("azure_username");
        password = System.getenv("azure_password");
        try {
            conn = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
