import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		FileWriter out=new FileWriter("F:\\info.txt",true);
		String fName=request.getParameter("firstName");
		String lName=request.getParameter("lastName");
		String date=request.getParameter("bdate");
		String mail=request.getParameter("mail");
		String gender=request.getParameter("gender");
		out.write(fName+","+lName+","+date+","+mail+","+gender+"\r\n");
		out.close();
	}
}