import java.io.*;
import java.net.Socket;

public class TCPClient
{
	public static void main(String args[]) throws IOException
	{
		String ip="127.0.0.1";
		int port=1255;
		Socket skt= new Socket(ip,port);
		
		/*OutputStreamWriter converts data into stream format
		i want to send data to output side of socket that is skt.getOutputStream
		in summary we say that convert data and where to send data*/
		OutputStreamWriter os=new OutputStreamWriter(skt.getOutputStream());	
		PrintWriter pw=new PrintWriter(os,true);
		String data="How are you Mr.Server ?.";
		pw.println(data);
		pw.flush();
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
		System.out.println("Data from server: "+br.readLine());
		
		//out.flush();
		//out.close();
		//skt.close();
		
	}
}