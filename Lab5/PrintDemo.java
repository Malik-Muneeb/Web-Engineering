
public class PrintDemo 
{
	void print()
	{
		System.out.println("Starting "+Thread.currentThread().getName());
		synchronized(this)
		{
			for(int n=5; n>0; n--)
			{
				System.out.println("Counter: "+n);
			}
			System.out.println(Thread.currentThread().getName()+" Exiting");
		}
		
		
	}
}
