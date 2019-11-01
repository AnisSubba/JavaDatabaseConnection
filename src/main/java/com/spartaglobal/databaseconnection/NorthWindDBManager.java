package com.spartaglobal.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NorthWindDBManager {

    private PropertiesManager props = new PropertiesManager();
    private final String CONNECTIONURL = "jdbc:sqlserver://localhost:1433;databaseName=northwind;user="+ props.getUsername() +";password=" + props.getPassword();

    public Connection northWindConnection() throws  SQLException{
        // given the static method a sql exception
        return DriverManager.getConnection(CONNECTIONURL);
    }
}
