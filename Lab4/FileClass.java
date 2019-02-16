import java.io.*;
import java.util.Scanner;
public class FileClass 
{
	public static void main(String args[])
	{
		System.out.println("Enter File Name: ");
		Scanner input= new Scanner(System.in);
		String file=input.next();
		boolean check = new File(file).exists();
		if(check==false)
		{
			System.out.println("File is not Found, but i craeted textout.txt");
			try
			{
				FileWriter fr=new FileWriter("testout.txt");
				fr.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
		else
		{
			String str="\n";
			try
			{	
				FileReader fr= new FileReader(file);
				int i=0;
				while ((i = fr.read()) != -1)
					str=str+(char)i;
				fr.close();
				System.out.println(str);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
			System.out.println("Enter your choice: ");
			int ch=input.nextInt();
			
			while(ch!=4)
			{
				if(ch==1)
				{
					System.out.println("Enter a number to find its factorial: ");
					int num=input.nextInt();
					int fac=factorial(num);
					System.out.println("Factorial of "+num+" is: "+fac);
					String str1="\nFactorial is: "+fac;
					try 
					{
						FileWriter fw=new FileWriter("Task2Results.txt",true);
						fw.write(str1);
						fw.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
				}
				else if(ch==2)
				{
					System.out.println("how many numbers you want to enter: ");
					int count=input.nextInt();
					System.out.println("Enter numbers to find prime numbers: ");
					int arr[]=new int[count];
					for(int i=0; i<count;i++)
					{
						arr[i]=input.nextInt();
					}
					int prime=primeNumbers(arr);	
					System.out.println("Prime Numbers are: "+prime);
					String str1="\nPrime Numbers are: "+prime;
					try 
					{
						FileWriter fw=new FileWriter("Task2Results.txt",true);
						fw.write(str1);
						fw.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				else if(ch==3)
				{
					System.out.println("how many numbers you want to enter: ");
					int count=input.nextInt();
					System.out.println("Enter numbers to find even and odd numbers: ");
					int arr[]=new int[count];
					for(int i=0; i<count;i++)
					{
						arr[i]=input.nextInt();
					}
					int arrCount[]=evenOdd(arr);	
					System.out.println("Even Numbers are: "+arrCount[0]);
					System.out.println("Odd Numbers are: "+arrCount[1]);
					String str1="\nEven Numbers are: "+arrCount[0];
					String str2="\nOdd Numbers are: "+arrCount[1];
					
					try 
					{
						FileWriter fw=new FileWriter("Task2Results.txt",true);
						fw.write(str1);
						fw.write(str2);
						fw.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				System.out.println("Enter your choice: ");
				ch=input.nextInt();
			}
		}
	}
	
	static int factorial(int num)
	{
		if(num==0)
			return 1;
		else
			return factorial(num-1)*num;
	}
	
	static int primeNumbers(int arr[])
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			int num=arr[i];
			boolean flag=true;
			for(int j=2; j<num/2 && flag; j++)
			{
				if(num%j==0)
					flag=false;
			}
			if(flag)
				count++;
		}
		return count;
	}
	
	static int[] evenOdd(int arr[])
	{
		int arrCount[]=new int[2];
		for(int i=0; i<arr.length; i++)
		{
			if(i%2!=0)
				arrCount[0]++;
			else
				arrCount[1]++;
		}
		return arrCount;
			
	}
}
