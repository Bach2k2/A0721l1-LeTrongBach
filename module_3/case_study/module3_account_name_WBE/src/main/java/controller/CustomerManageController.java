package controller;

import model.Customer;
import repository.CusRepository;
import service.ICustomerManagement;
import service.CustomerManageImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerManageController", urlPatterns = "/customers")
public class CustomerManageController extends HttpServlet {
    private ICustomerManagement customerManagement = new CustomerManageImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    createCustomer(request, response);
                    break;
                case "update":
                   // updateCustomer(request,response);
                    break;
                case "delete":
                    deleteCustomer(request,response);
                    break;
                case "search":
                    break;
                default:
                    break;
            }
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateForm(request, response);
                    break;
                case "update":
                    showUpdateForm(request, response);
                    break;
                case "delete":
                    showDeleteForm(request,response);
                    break;
                case "search":
                    break;
                case "view":
                    break;
                default:
                    displayAllCustomer(request, response);
                    break;
            }
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void displayAllCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = customerManagement.getCusList();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/customer_list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/customer/create_customer.jsp").forward(request, response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerManagement.getCusById(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("/customer/update_customer.jsp").forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int typeId = Integer.parseInt(request.getParameter("type_id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, typeId, name, birthday, gender, idCard, phone, email, address);
        boolean check = customerManagement.createCus(customer);
        if (check) {
            request.setAttribute("message", "Complete, created a customer successfully");
        } else {
            request.setAttribute("message", "Sorry, created a customer unsuccessfully");
        }
        request.getRequestDispatcher("customer/create_customer.jsp").forward(request, response);
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int typeId = Integer.parseInt(request.getParameter("type_id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = customerManagement.getCusById(id);
        customer.setName(name);
        customer.setBirthday(birthday);
        customer.setGender(gender);
        customer.setIdCard(idCard);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setAddress(address);
        boolean check = customerManagement.updateCus(customer);

        if (check) {
            request.setAttribute("message", "Complete, updated a customer successfully");
        } else {
            request.setAttribute("message", "Sorry, updated a customer unsuccessfully");
        }
        request.getRequestDispatcher("customer/update_customer.jsp").forward(request, response);
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerManagement.getCusById(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("customer/delete_customer.jsp").forward(request, response);
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerManagement.getCusById(id);
        boolean check=customerManagement.deleteCus(customer);
        if(check)
        {
            request.setAttribute("message","Successful");
        }
        else
        {
            request.setAttribute("message","Unsuccessful");
        }
        request.getRequestDispatcher("customer/delete_customer.jsp").forward(request, response);
    }

}
