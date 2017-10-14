package Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("user") && password.equals("12345")) {
            request.getSession().setAttribute("myLogin", username);
            request.getSession().setAttribute("myPassword", password);

            request.getRequestDispatcher("/PrincipalS").forward(request, response);
        }else
            response.sendRedirect("formulario-login.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("formulario-login.jsp");
    }
}
