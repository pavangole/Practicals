import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class Practical24 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            out.print("<html>");
            out.print("<head> <title>Customers_Registration</title></head>");
            out.print("<body><table>");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            Statement stmt = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/practical24", "root", "mysql");
            stmt = conn.createStatement();
            String a = "insert into signup (EmailID, Password) values( '"+ email + "', '"+ password + "')";

            ResultSet rs = stmt.executeQuery(a);
            rs.close();
            stmt.close();
            conn.close();
            out.print("</table></body></html>");

        } catch (Exception e) {
            out.print(e.getLocalizedMessage());
        }
    }
}