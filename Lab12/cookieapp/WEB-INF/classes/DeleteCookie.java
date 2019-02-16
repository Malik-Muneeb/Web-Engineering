import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		Cookie cookies[] = request.getCookies();
		if(cookies!=null)
		{
			for (int i = 0; i < cookies.length; i++) 
			{
				Cookie c = cookies[i];
				c.setMaxAge(0);
			}
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<p>Cookies Deleted.</p>");
			out.print("</body></html>");
			out.close();
		}
	}
}