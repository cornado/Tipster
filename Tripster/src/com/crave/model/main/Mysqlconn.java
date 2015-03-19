// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Mysqlconn.java

package com.crave.model.main;

import java.io.PrintStream;
import java.sql.*;

public class Mysqlconn
{

    public Mysqlconn()
    {
    }

    public static Connection getConnection()
    {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tripster", "root", "cornado91");
        }
        catch(SQLException e)
        {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return connection;
        }
        if(connection != null)
            System.out.println("You made it, take control your database now!");
        else
            System.out.println("Failed to make connection!");
        return connection;
    }
}
