package controller;

import repos.CustomerRepos;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "CusomerServlet",urlPatterns = "/customer")
public class CusomerServlet extends javax.servlet.http.HttpServlet {
    private CustomerRepos customerRepos=new CustomerRepos();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


    }
}
