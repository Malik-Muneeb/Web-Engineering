import java.util.Scanner;
public class task4
{

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter min Number: ");
		int num1=input.nextInt();
		System.out.print("Enter max Number: ");
		int num2=input.nextInt();
		
		PrimeNumber obj= new PrimeNumber();
		try
		{
			System.out.println("Total Prime Number is: "+obj.count(num1,num2));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}