import java.io.*;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Enter a string: ");
		Scanner input= new Scanner(System.in);
		String str= input.nextLine();
		try 
		{
			FileWriter fw=new FileWriter("PalindromeFile.txt");
			fw.write(str);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("e1");
			System.out.println(e);
		}
		
	/*String str1=null;
		try
		{	
			FileReader fr= new FileReader("PalindromeFile.txt");
			int i=0;
			while ((i = fr.read()) != -1)
				str1=str1+(char)i;
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		splitString(str);
	}
	
	public static void splitString(String str)
	{
		String[] strArr = str.split(" ");
		for(int i=0; i<str.length(); i++)
		{
			isPalindrome(strArr[i]);
		}
	}
	
	public static void isPalindrome(String str)
	{
		int maxLen=str.length()-1;
		char strArr[]=str.toCharArray();
		boolean flag=true;
		for(int i=0; i<str.length()/2 && flag; i++)
		{
			if(strArr[i]!=strArr[maxLen])
			{
				flag=false;
			}
			maxLen--;
		}
		if(flag)
			System.out.println(str);
	}
}


