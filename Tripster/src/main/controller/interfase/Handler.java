// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Handler.java

package main.controller.interfase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import main.controller.validator.Login;

@WebServlet("/Handler")
public class Handler extends HttpServlet
{

    public Handler()
    {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        resp.sendRedirect("Index.html");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        PrintWriter pw = resp.getWriter();
        Login lo = new Login();
        if(lo.validate(req))
        {
            req.setAttribute("name", req.getParameter("userid"));
            req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
        } else
        {
            pw.print("login failed");
        }
        pw.flush();
    }

    private static final long serialVersionUID = 1L;
}
