package controller;

import model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeManageController",urlPatterns = "/employees")
public class EmployeeManageController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action =request.getParameter("action");
        if(action==null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                break;
            case "update":
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action =request.getParameter("action");
        if(action==null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                showCreateForm(request,response);
                break;
            case "update":
                showUpdateForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                break;
            case "search":
                break;
            default:
                displayEmployeeList(request,response);
                break;
        }
    }
    private void displayEmployeeList(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        request.getRequestDispatcher("employee_list.jsp").forward(request,response);

    }
    private void showCreateForm(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        request.getRequestDispatcher("create_employee.jsp").forward(request,response);
    }
    private void showUpdateForm(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        request.getRequestDispatcher("update_employee.jsp").forward(request,response);
    }
    private void showDeleteForm(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        request.getRequestDispatcher("delete_employee.jsp").forward(request,response);
    }
    private void createEmployee(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        int emId= Integer.parseInt(request.getParameter("employee_id"));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        String idCard=request.getParameter("id_card");
        double salary=Double.parseDouble(request.getParameter("salary"));
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        int posId= Integer.parseInt(request.getParameter("position"));
        int eDId= Integer.parseInt(request.getParameter("ed_id"));
        int divisionId= Integer.parseInt(request.getParameter("division"));
        String username=request.getParameter("username");
        Employee employee=new Employee(emId,name,birthday,idCard,salary,phone,email,address,posId,eDId,divisionId,username);
        request.setAttribute("employee",employee);
       // em
        request.setAttribute("message","Created success");
        request.getRequestDispatcher("create_employee.jsp").forward(request,response);
    }
}
