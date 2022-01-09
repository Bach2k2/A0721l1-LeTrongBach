import model.Calculator;
import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double firstNum = Double.parseDouble(request.getParameter("first"));
            double secondNum = Double.parseDouble(request.getParameter("second"));
            String operator = request.getParameter("operator");
            double result = Calculator.calculate(firstNum, secondNum, operator);
            request.setAttribute("result", result);
            RequestDispatcher dispatcher = request.getRequestDispatcher("calculator.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException N) {
            request.setAttribute("message", "Hãy kiểm tra lại dữ liệu nhập vào");
            RequestDispatcher dispatcher = request.getRequestDispatcher("calculator.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException E) {
                E.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("calculator.jsp");
    }
}
