
public class ArrayLength 
{
	public static int length(int arr[])
	{
		int len=0;
		int anything=0;
		try
		{
			for(int i=0; ; i++)
			{
				len++;
				anything=arr[len];
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			return len;
		}
		
	}
	public static void main(String args[])
	{
		int arr[]= {2,4,6,7};
		int len=length(arr);
		System.out.println("Length: "+len);
		
	}
}
