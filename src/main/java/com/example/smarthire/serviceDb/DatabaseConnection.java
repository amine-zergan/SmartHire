package com.example.smarthire.serviceDb;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {

    public Connection databaselink;
    public Connection getConnection() {
        String databaseName = "";
        String databaseUser = "";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost/" + databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);
            return databaselink;
        } catch (Exception e) {
            System.out.println(" ////////****** impossible de connecter a la base ****/////////////");
            e.printStackTrace();
        }
        return databaselink;
    }




}
