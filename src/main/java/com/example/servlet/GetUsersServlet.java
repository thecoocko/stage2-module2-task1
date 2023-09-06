package com.example.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (Objects.nonNull(request)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/users.jsp");
            if (Objects.nonNull(dispatcher)) {
                dispatcher.forward(request, response);
            }
        }
    }
}
