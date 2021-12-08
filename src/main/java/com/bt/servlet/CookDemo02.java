package com.bt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookdemo02")
public class CookDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        if (cookies!=null){
            for (Cookie c:cookies){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+value);
            }
        }else {
            System.out.println("BAy");
        }

    }
}
