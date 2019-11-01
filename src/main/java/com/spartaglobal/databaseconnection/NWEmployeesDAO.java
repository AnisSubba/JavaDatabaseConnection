package com.spartaglobal.databaseconnection;

import java.sql.*;

public class JDBExamples {

    private  NorthWindDBManager northWindDBManager = new NorthWindDBManager();
    private final String SQL = "SELECT TOP 10 * FROM Employees";

    public void iterateThroughEmployee(){
        try(Statement stmt = northWindDBManager.northWindConnection().createStatement()){
            // getting the statement and executing the sql
            ResultSet results = stmt.executeQuery(SQL);

            while (results.next()){
                System.out.println(results.getString("FirstName") + " " + results.getString("LastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
