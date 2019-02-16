import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowData extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String name=request.getParameter("fName");
		String read;
		FileReader fr = new FileReader("F:\\info.txt");
		BufferedReader br = new BufferedReader(fr);
		PrintWriter out = response.getWriter();
		boolean isFound=false;
		while((read=br.readLine())!=null)
		{
			String[] strArr = read.split(",");
			if(strArr[0].equals(name))
			{
				out.print("<html> <body>"+
				"<label>First Name: "+strArr[0]+"</label><br>"+
				"<label>Last Name: "+strArr[1]+"</label><br>"+
				"<label>Date of Birth: "+strArr[2]+"</label><br>"+
				"<label>Email: "+strArr[3]+"</label><br>"+
				"<label>Gender: "+strArr[4]+"</label><br>"+
				"</body></html>");
				isFound=true;
				break;
			}
			
		}
		if(!isFound)
				out.print("Not Found");
		out.close();
		br.close();
		fr.close();
	}
}