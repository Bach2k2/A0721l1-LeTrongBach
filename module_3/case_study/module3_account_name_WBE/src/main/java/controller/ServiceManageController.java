package controller;

import model.Customer;
import model.Service;
import service.IServiceManagement;
import service.ServiceManageImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceManageController", urlPatterns = "/services")
public class ServiceManageController extends HttpServlet {
    IServiceManagement serviceManage = new ServiceManageImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    createService(request,response);
                    break;
                case "update":
                    updateService(request,response);
                    break;
                case "delete":
                   deleteService(request,response);
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
                    showDeleteForm(request, response);
                    break;
                case "search":
                    break;
                case "view":
                    break;
                default:
                    displayServiceList(request, response);
                    break;
            }
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void displayServiceList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = serviceManage.getServiceList();
        request.setAttribute("services", serviceList);
        request.getRequestDispatcher("service/service_list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/service/create_service.jsp").forward(request, response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/service/update_service.jsp").forward(request, response);
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/service/delete_service.jsp").forward(request, response);
    }
    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int serId= Integer.parseInt(request.getParameter("id"));
        String serName =request.getParameter("serName");
        int area = Integer.parseInt(request.getParameter("area"));
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int maxPeople = Integer.parseInt(request.getParameter("max_people"));
        int rentType = Integer.parseInt(request.getParameter("rent_type_id"));
        int typeId = Integer.parseInt(request.getParameter("type_service"));
        String standard = request.getParameter("standard");
        String description =request.getParameter("description");
        int poolArea = Integer.parseInt(request.getParameter("pool_area"));
        int numOfFloor = Integer.parseInt(request.getParameter("floors"));

        Service service=new Service(serId,serName,area,deposit,maxPeople,rentType,typeId,standard,description,poolArea,numOfFloor);
        boolean check = serviceManage.createService(service)
        if (check) {
            request.setAttribute("message", "Complete, created a service successfully");
        } else {
            request.setAttribute("message", "Sorry, created a service unsuccessfully");
        }
        request.getRequestDispatcher("service/create_service.jsp").forward(request, response);
    }

    private void updateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int serId= Integer.parseInt(request.getParameter("id"));
        String serName =request.getParameter("serName");
        int area = Integer.parseInt(request.getParameter("area"));
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int maxPeople = Integer.parseInt(request.getParameter("max_people"));
        int rentType = Integer.parseInt(request.getParameter("rent_type_id"));
        int typeId = Integer.parseInt(request.getParameter("type_service"));
        String standard = request.getParameter("standard");
        String description =request.getParameter("description");
        int poolArea = Integer.parseInt(request.getParameter("pool_area"));
        int numOfFloor = Integer.parseInt(request.getParameter("floors"));

        Service service= serviceManage.getServiceById(serId);

        service.setSerName(serName);
        service.setArea(area);
        service.setCost(deposit);
        service.setMaxPeople(maxPeople);
        service.setRentType(rentType);
        service.setTypeId(typeId);
        service.setStandard(standard);
        service.setDescription(description);
        service.setPoolArea(poolArea);
        service.setNumOfFloor(numOfFloor);
        boolean check=serviceManage.updateService(service);
        if (check) {
            request.setAttribute("message", "Complete, updated a service successfully");
        } else {
            request.setAttribute("message", "Sorry, updated a service unsuccessfully");
        }
        request.getRequestDispatcher("service/update_service.jsp").forward(request, response);
    }


    private void deleteService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int serId= Integer.parseInt(request.getParameter("id"));
        Service service= serviceManage.getServiceById(serId);
        boolean check=serviceManage.deleteService(service);
        if(check)
        {
            request.setAttribute("message","Successful");
        }
        else
        {
            request.setAttribute("message","Unsuccessful");
        }
        request.getRequestDispatcher("service/delete_service.jsp").forward(request, response);
    }

}
