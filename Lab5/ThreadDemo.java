
public class ThreadDemo extends Thread 
{
	PrintDemo p=new PrintDemo();
	public void run()
	{
		p.print();
	}

	
	public static void main(String args[])
	{
		ThreadDemo t=new ThreadDemo();
		Thread t1=new Thread(t,"Thread - 1");
		Thread t2=new Thread(t,"Thread - 2");
		
		t1.start();
		t2.start();
	}

}
