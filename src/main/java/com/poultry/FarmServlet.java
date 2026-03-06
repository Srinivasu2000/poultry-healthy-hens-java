package com.poultry;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class FarmServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<h1>Welcome to Healthy Hens Poultry Farm</h1>");
    }
}
