import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value="/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description= request.getParameter("product_desc");
        double price=Double.parseDouble(request.getParameter("list_price"));
        double percent=Double.parseDouble(request.getParameter("dis_percent"));
        double amount =price * percent * 0.01;
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<br>So luong chiet khau: "+ amount);
        out.println("<br>Phan tram chiet khau: "+ percent);
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
