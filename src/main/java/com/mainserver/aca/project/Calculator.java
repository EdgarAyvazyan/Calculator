package com.mainserver.aca.project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        double n1 = Double.parseDouble(req.getParameter("fnum"));
        double n2 = Double.parseDouble(req.getParameter("snum"));
        String op = req.getParameter("op");


        if(op.equals("addition")){
            out.println("<h1>Addition result: </h1>" + (n1 + n2));
        }
        else if(op.equals("subtraction")){
            out.println("<h1>Subtraction result: </h1>" + (n1 - n2));
        }
        else if(op.equals("multiplication")){
            out.println("<h1>Multiplication result: </h1>" + (n1 * n2));
        }
        else{
            if (n2 == 0){
                out.println("<h1>division by zero!!! Error</h1>");
            }else {
                out.println("<h1>division result: </h1>" + (n1 / n2));
            }
        }
    }
}
