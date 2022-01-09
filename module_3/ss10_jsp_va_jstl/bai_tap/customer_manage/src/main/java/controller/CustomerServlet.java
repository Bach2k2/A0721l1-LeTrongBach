package controller;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import model.Customer;
import service.CustomerService;
import service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet",urlPatterns = "/customers")
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    private ICustomerService customerService=new CustomerService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        display(request,response);
    }
    private void display(HttpServletRequest request,HttpServletResponse response)
    {
        List<Customer> customers=this.customerService.findAll();
        request.setAttribute("customers",customers);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer_list.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (IOException | ServletException e)
        {
            e.printStackTrace();
        }
    }

}
