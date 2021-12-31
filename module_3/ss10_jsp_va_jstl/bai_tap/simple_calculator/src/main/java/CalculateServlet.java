import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            case "*8":
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
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Result: </h1>");
        writer.println("<p>"+firstNum + operator + secondNum +"="+result+"</p>");
        writer.println("</html>");
    }
}
