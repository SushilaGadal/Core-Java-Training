package con.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class WelcomeServlet
 */

public class WelcomeServlet extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("user");
	String password=request.getParameter("pass");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	
		PrintWriter pw=response.getWriter();

				pw.println("<html><body bgcolor='lightblue'>");
				pw.println("<center><h1>Welcome to java, "+username+"with"+email+"and "+phone+" </h1></center>");
				pw.println("</body> </html>");
	}

}
