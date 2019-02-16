
public class MyThread implements Runnable 
{
	String t_name;
	Thread t;
	
	MyThread(String name)
	{
		t_name=name;
		t=new Thread(this,t_name);
		System.out.println("Child Thread created: "+t);
		t.start();
	}
	
	public void run() 
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println("thread " +t_name+ ":"+ i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread " +t_name+ "Interrupted");
		}
		System.out.println("thread " +t_name+ " Existing");
	}
	
	public static void main(String args[])
	{
		new MyThread("one");
		new MyThread("Two");
		new MyThread("Three");
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main exiting");
	}

}
