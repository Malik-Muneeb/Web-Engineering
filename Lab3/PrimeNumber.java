public class PrimeNumber
{
	public int count(int min, int max) throws Exception
	{
		if (min>=max)
		{
			throw new Exception("Invalid range: minimum is greater than or equal to maximum.");
		}
		else
		{
			int count=0;
			
			for(; min<max; min++)
			{
				double sqrt=Math.sqrt(min);
				sqrt=java.lang.Math.ceil(sqrt);
				boolean flag=true;
				if (min==1)
				{
					min++;
					System.out.println("You enter 1 as minimum. pr mene isay 2 kr dia ha :D hehehehe");
				}					
				if(min==2)
				{
					count++;
					min++;
				}
				for(int i=2; i<=sqrt && flag; i++)
				{
					if(min%i==0)
						flag=false;
				}
				if(flag)
					count++;
			}
			return count;
		}
	}
}