public class ArmstrongImplementation extends Armstrong
{
	public void armstrongNumbers()
	{
		for(int i=0; i<=1000; i++)
		{
			int num=i;
			int arr[]=new int[4];
			int count=0;
			int arrSub=0;
			while(num!=0)
			{
				arr[arrSub]=num%10;
				num=num/10;
				arrSub++;
			}
			int calc=0;
			for(int i=0 ;i<=arrSub; i++)
			{
				if(arrSub==0)
				calc=
			}
			
			if(i==sum)
				System.out.print(" "+sum);
		}
	}
}