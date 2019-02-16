import java.util.Scanner;
public class task4
{
	public static void main(String args[]) 
	{
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num<0)
			System.out.println("The integer is negative");
		else
			System.out.println("This integer is positive");
	}
}