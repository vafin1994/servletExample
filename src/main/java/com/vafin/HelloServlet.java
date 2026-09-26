package com.vafin;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.Color.red;


public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Service called");
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<span style='color: red'>Hello, World</span>");

        out.println("<h2>Title</h2>");
    }

}
