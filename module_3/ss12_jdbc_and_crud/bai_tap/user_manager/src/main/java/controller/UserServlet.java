package controller;

import dao.IUserDAO;
import dao.UserDAO;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private UserDAO userService = new UserDAO();
    private int amount = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    createUser(request, response);
                    break;
                case "update":
                    updateUser(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                default:
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ServletException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
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
                case "view":
                    viewUser(request, response);
                    break;
                case "find_by_country":
                    findByCountry(request, response);
                    break;
                case "sort":
                    sortUser(request, response);
                    break;
                default:
                    displayAllUsers(request, response);
                    break;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void displayAllUsers(HttpServletRequest request, HttpServletResponse response) {
        List<User> users = userService.selectAllUsers();
        amount = userService.getAmount();
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list_user.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("create_user.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = amount++;
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        userService.insertUser(user);
        request.setAttribute("message", "Tạo mới thành công");
        RequestDispatcher dispatcher = request.getRequestDispatcher("create_user.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            User user = userService.selectUser(id);
            request.setAttribute("user", user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit_user.jsp");
        dispatcher.forward(request, response);
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);

        try {
            boolean check = userService.updateUser(user);
            if (check) request.setAttribute("message", "ok");
            else {
                request.setAttribute("message", "No effect");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("edit_user.jsp").forward(request, response);
    }

    private void showDeleteForm(HttpServletRequest req, HttpServletResponse res)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userService.selectUser(id);
        req.setAttribute("name", user.getName());
        req.setAttribute("email", user.getEmail());
        req.setAttribute("country", user.getCountry());
        RequestDispatcher dispatcher = req.getRequestDispatcher("delete_user.jsp");
        dispatcher.forward(req, res);
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            userService.deleteUser(id);
            request.setAttribute("message", "Xoa thanh cong");
            RequestDispatcher dispatcher = request.getRequestDispatcher("delete_user.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private void viewUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            User user = userService.selectUser(id);
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view_user.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void findByCountry(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String country = request.getParameter("country");
        List<User> users = userService.selectByCountry(country);
        request.setAttribute("users", users);
        request.getRequestDispatcher("list_user.jsp").forward(request, response);
    }

    private void sortUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        List<User> users = userService.sortByName();
        request.setAttribute("users", users);
        request.getRequestDispatcher("list_user.jsp").forward(request, response);
    }
}

