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

@WebServlet(name = "CalculateServlet",value = "/calculate",urlPatterns = "/calculator")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            double firstNum= Double.parseDouble(request.getParameter("first"));
            double secondNum= Double.parseDouble(request.getParameter("second"));
            double result = 0;
            String operator=request.getParameter("operator");
            switch (operator)
            {
                case "+":
                {
                    result=firstNum+secondNum;
                    break;
                }
                case "-":
                {
                    result=firstNum-secondNum;
                    break;
                }
                case "*":
                {
                    result=firstNum*secondNum;
                    break;
                }
                case "/":
                {
                    result=firstNum/secondNum;
                    break;
                }
                default: break;
            }
            request.setAttribute("firstNum",firstNum);
            request.setAttribute("secondNum",secondNum);
            request.setAttribute("operator",operator);
            request.setAttribute("result",result);
            RequestDispatcher dispatcher =request.getRequestDispatcher("Calculator.jsp");
            try{
                dispatcher.forward(request,response);
            }catch (ServletException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        catch(NumberFormatException e){
            request.setAttribute("message","Warning: Hãy kiểm tra lại dữ liệu đầu vào!");
            try{
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }catch (ServletException ex)
            {
                ex.printStackTrace();
            }
            catch(IOException i)
            {
                i.printStackTrace();
            }
        }
    }
}
