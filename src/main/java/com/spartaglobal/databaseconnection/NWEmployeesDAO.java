package com.spartaglobal.databaseconnection;

import java.sql.*;
import java.util.List;

public class NWEmployeesDAO {

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

    public int getTotalNumberOfEmployeeV1(){
        int empNum = 0;
        final String SQL = "SELECT COUNT(*) AS 'Total' FROM Employees";
        try(Statement stmt = northWindDBManager.northWindConnection().createStatement()){
            ResultSet results = stmt.executeQuery(SQL);

            while (results.next()){
                empNum = results.getInt("Total");
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return empNum;
    }

}
