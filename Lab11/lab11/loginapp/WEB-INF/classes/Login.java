import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName.equals("Muneeb") && password.equals("123"))
			response.sendRedirect("welcome.html");
		else
			response.sendRedirect("validate.html");	
		
	}
}