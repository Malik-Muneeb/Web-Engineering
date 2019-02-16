import java.net.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class TCPServer 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		int port=1255;
		System.out.println("Server is started");
		ServerSocket ss=new ServerSocket(port);
		System.out.println("Server is waiting for client request");
		Socket skt=ss.accept();
		System.out.println("Client Connected");
		
		//InputStreamReader is=new InputStreamReader(skt.getInputStream());
		BufferedReader br =new BufferedReader(new InputStreamReader(skt.getInputStream()));
		String data=br.readLine();
		System.out.println("Message from Miss Client: "+data);
		
		//TimeUnit.SECONDS.sleep(5);
		
		
		String msg="I am fine Miss Client. What about you ?";
		OutputStreamWriter os=new OutputStreamWriter(skt.getOutputStream());
		PrintWriter pw=new PrintWriter(os,true);
		pw.println(msg);
		pw.flush();
		System.out.println("S : data sent from server");
		//pr.close();
		
		//ss.close();
	}
}
