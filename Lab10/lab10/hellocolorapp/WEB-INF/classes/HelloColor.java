import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloColor extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		String colorName=request.getParameter("colorName");
		out.print("<html><body><h1 style='color:"+colorName+";'> HelloWorld </h1> </body></html>");
	}
}