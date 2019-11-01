package com.spartaglobal.databaseconnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NWEmployeesDAO jdbExamples = new NWEmployeesDAO();
        jdbExamples.iterateThroughEmployee();
        System.out.println(jdbExamples.getTotalNumberOfEmployeeV1());

//        PropertiesManager props = new PropertiesManager();
//        System.out.println(props.getUsername());

    }
}
