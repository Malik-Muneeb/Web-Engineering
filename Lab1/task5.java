import java.util.Scanner;
public class task5
{
	public static void main(String args[]) 
	{
		System.out.print("Do you want to start(Y/N): ");
		Scanner input = new Scanner(System.in);
		String per;
		per = input.next();
		while(per=="y" || per=="Y")
		{
			int num=0;
			System.out.print("Enter an integer and I will convert it to binary code: ");
			input = new Scanner(System.in);
			num=input.nextInt();
			System.out.println("You entered "+num);
			int num1=num;
			String output="";
			while(num!=0)
			{
				output=num%2+output;
				num=num/2;
			}
			
			System.out.println(num1+" in binary is "+output);
			
			System.out.print("Do you want to start(Y/N): ");
			input = new Scanner(System.in);
			per = input.next();
		
		}
		
	}
}