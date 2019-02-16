import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculate extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		int total = quantity*100;
		String price = total+"";
		PrintWriter o = resp.getWriter();
		o.println("<html><body>");
		o.println("<h2>The total Bill is: "+price+"  </h2>");
		o.println("</body></html>");
		o.flush();
		o.close();

	}
}