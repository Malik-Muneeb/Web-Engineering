import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter out=response.getWriter();
		Cookie[] cookies = request.getCookies();
		if (cookies != null) 
		{
			for (int i = 0; i < cookies.length; i++) 
			{
				Cookie c = cookies[i];
				String name = c.getName();
				String val = c.getValue();
				out.println("<html><body><form method='GET' action = 'http://localhost:8081/cookieapp/delete'");
				out.println("Cookie Name: "+name);
				out.println("Cookie Value: "+val);
			}
			out.println("<input type='submit' value='Delete Cookie'");
			out.println("</form></body></html>");
		}
		else
		{
			Cookie c = new Cookie (userName, password);
			c.setMaxAge(60);
			response.addCookie(c);
			out.println("<html><body><form method='GET' action = 'http://localhost:8081/cookieapp/login'");
			out.println("<p>Cookies are created. Click on the below button to get cookies</p>");
			out.println("<input type='submit' value='Get Cookie' >");
			out.println("</form></body></html>");
		}
		out.close();
	}
}
