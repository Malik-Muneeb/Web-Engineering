import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Palindrome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String expression = request.getParameter("expression");
		ServletConfig config = getServletConfig();
		String pUserName = config.getInitParameter("username");
		String pPassword = config.getInitParameter("password");
		PrintWriter out=response.getWriter();
		if (userName.equals(pUserName) && password.equals(pPassword)) 
		{
			if(isPalindrome(expression))
				out.print("<html><body> <h3> This expression "+expression+" is palindrome</h3");
			else
				out.print("<html><body> <h3> This expression "+expression+" is not palindrome</h3");
			
		}
		else
		{
			out.print("<html><body> <h3> You have entered wrong username or password</h3");
		}
	}

	public static boolean isPalindrome(String str) 
	{
		int maxLen = str.length() - 1;
		char strArr[] = str.toCharArray();
		boolean flag = true;
		for (int i = 0; i < str.length() / 2 && flag; i++) {
			if (strArr[i] != strArr[maxLen]) {
				flag = false;
			}
			maxLen--;
		}
		return flag;
	}
}