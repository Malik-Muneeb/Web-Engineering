import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String value= (String)request.getAttribute("Welcome");
		PrintWriter out=response.getWriter();
		if(value.equals("true"))
			out.print("<html><body> Welcome "+request.getParameter("userName")+" </body></html>");
		else
			response.sendRedirect("validate.html");
		out.close();
	}
}