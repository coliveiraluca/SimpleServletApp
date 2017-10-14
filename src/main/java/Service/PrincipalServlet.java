package Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PrincipalS")
public class PrincipalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("myLogin", getServletContext().getAttribute("myLogin"));
        //request.setAttribute("myPassword", getServletContext().getAttribute("myPassword"));
        request.getRequestDispatcher("/tela-principal.jsp").forward(request, response);
    }
}
