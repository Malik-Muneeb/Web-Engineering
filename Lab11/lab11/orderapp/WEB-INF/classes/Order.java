import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Order extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/calculate");
		dispatcher.include(req, res);
	}
}