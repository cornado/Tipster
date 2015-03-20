// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Login.java

package main.controller.validator;

import java.io.PrintStream;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;

import main.model.connection.Mysqlconn;

public class Login
{

    public Login()
    {
        sql = "select Email_id,user_name,password from tripster.user where Email_id = ? ";
    }

    public boolean validate(HttpServletRequest req)
    {
        Connection co;
        System.out.println("in validation page");
        co = Mysqlconn.getConnection();
        ResultSet rs;
        

        System.out.println((new StringBuilder("from db:")).append(req.getParameter("pass")).toString());
        try {
        	PreparedStatement ps = co.prepareStatement(sql);
			ps.setString(1, req.getParameter("userid"));
			rs = ps.executeQuery();
			if(rs.next())
			{
				 if(req.getParameter("pass").equals(rs.getString("password")))
			
			return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
       
        

    }

    String sql;
    String name;
}
