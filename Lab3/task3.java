import java.util.Scanner;
public class task3
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first Number: ");
		float num1=input.nextFloat();
		System.out.print("Enter second Number: ");
		float num2=input.nextFloat();
		
		Quotient obj= new Quotient();
		try
		{
			System.out.println("Quotient is: "+obj.calcQuotient(num1,num2));
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		
	}
}