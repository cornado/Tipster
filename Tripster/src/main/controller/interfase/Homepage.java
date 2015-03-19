// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Homepage.java

package main.controller.interfase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Homepage")
public class Homepage extends HttpServlet
{

    public Homepage()
    {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        super.doGet(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        resp.setContentType("text/html; charset=utf-8");
        String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
        PrintWriter pw = resp.getWriter();
        pw.print("");
        pw.print((new StringBuilder(String.valueOf(docType))).append("<HTML>\n").append("<HEAD><TITLE>Tripster </TITLE></HEAD>\n").append("<BODY><H1>").append("Welcome :").append(req.getSession().getAttribute("id")).append("</H1>\n").append("<textarea rows= \"4\" cols=\"50\"></textarea>").append("</BODY>").toString());
        pw.flush();
    }
}
