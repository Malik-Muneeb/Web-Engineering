import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserValidation extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		String uname, passwd="";
		uname = request.getParameter("uname");
		passwd = request.getParameter("passwd");
		Cookie[] cookies = request.getCookies();
		if(cookies==null)
		{
			if(uname.equals("Muneeb") && passwd.equals("123"))
			{
				Cookie c = new Cookie("Muneeb","123");
				c.setMaxAge(60);
				response.addCookie(c);
				response.sendRedirect("getCookies.html");	
			}
			else
				response.sendRedirect("index.html");	
		}
		else
		{
			PrintWriter out = response.getWriter();
					
					out.println("<html><body>");
			for (int i = 0; i < cookies.length; i++) 
			{
				Cookie c = cookies[i];
				String name = c.getName();
				String value = c.getValue();
					
					out.println("<p>Cookie Name: "+name+"  Cookie Value: "+value+"</p>");
					
			}
			out.println("<p>Click on below to delete Cookies.</p>");
					out.println("<form method='GET' action = 'http://localhost:8081/cookie/deleteCookies'>");
		
					out.println("<input type='submit' value='Delete Cookies'></form>");
					out.print("</body>" +//
						"</html>");
						out.close();
		}
	}
	
}