import java.util.Scanner;
public class task2
{
	public static void main(String args[]) 
	{
		System.out.print("Enter the upper bound: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		float sum=0;
		for(int i=1; i<=num; i++)
		{
			sum=sum+i;
		}
		double avg=sum/num;
		System.out.println("This sum is "+sum);
		System.out.println("This average is "+avg);
	}
}