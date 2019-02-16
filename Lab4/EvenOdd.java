public class EvenOdd 
{
	public static class Even extends Thread 
	{
		public void run() 
		{
			for(int i=0;i<=10;i++)
			{
				if(i%2==0)
					System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
	public static class Odd extends Thread 
	{
		public void run() 
		{
			for(int i=0;i<=10;i++)
			{
				if(i%2!=0)
					System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

		
	public static void main(String args[]) 
	{
			Even t1 = new Even();
			t1.start();
			Odd t2 = new Odd();
			t2.start();
			
	}
}


