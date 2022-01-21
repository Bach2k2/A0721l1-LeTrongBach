package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "FuramaResortServlet", urlPatterns = "")
public class FuramaResortServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        displayHome(request, response);
    }

    private void displayHome(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException servletException) {
            servletException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
