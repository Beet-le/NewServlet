package com.bt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CookDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie c1=new Cookie("msg","hello");
        c1.setMaxAge(30);
        Cookie c2=new Cookie("name","zaa");
        resp.addCookie(c1);
        resp.addCookie(c2);
    }
}
