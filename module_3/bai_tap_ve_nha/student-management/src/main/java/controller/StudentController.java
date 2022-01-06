package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController",urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
    private IStudentService iStudentService = new StudentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String grade = request.getParameter("grade");
                String gender = request.getParameter("gender");
                String dateOfBirth = request.getParameter("dateOfBirth");
                Student student = new Student(Integer.parseInt(id), name, dateOfBirth, Integer.parseInt(gender), Double.parseDouble(grade));
                if (iStudentService.createStudent(student)) {
                    request.setAttribute("msg", "Thêm mới thành công");
                    List<Student> studentList = iStudentService.findAll();
                    request.setAttribute("studentList", studentList);
                    request.getRequestDispatcher("list_student.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Thêm mới thất bại");
                    request.getRequestDispatcher("create_student.jsp").forward(request, response);
                }
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String grade = request.getParameter("grade");
                iStudentService.save(id, name, grade);
                response.sendRedirect("/student");
                break;
            }
            case "delete": {
                deleteStudent(request,response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                request.getRequestDispatcher("create_student.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                Student student = iStudentService.findById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("update_student.jsp").forward(request, response);
                break;
            }
            case "delete":{
                showDeleteForm(request,response);
                break;
            }
            default: {
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("studentList", studentList);
                request.getRequestDispatcher("/list_student.jsp").forward(request, response);
                break;
            }
        }
    }
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Student student = this.iStudentService.findById(id);
        RequestDispatcher dispatcher;
        if(student == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("student", student);
            dispatcher = request.getRequestDispatcher("/delete_student.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Student student = this.iStudentService.findById(id);
        RequestDispatcher dispatcher;
        if(student == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            this.iStudentService.remove(id);
            try {
                response.sendRedirect("/student");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

