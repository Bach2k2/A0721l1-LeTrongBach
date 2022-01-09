package controller;

import model.Customer;
import repos.CustomerRepos;
import repos.ICustomerRepos;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerManageServlet",urlPatterns = {"/customers"})
public class CustomerManageServlet extends HttpServlet {
    private ICustomerRepos customerRepos=new CustomerRepos();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("customer_list.jsp");
        listCustomers(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("customer_list.jsp");
        listCustomers(request,response);
    }
    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerRepos.findAll();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
