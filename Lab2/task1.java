public class task1
{
	public static void main(String args [])
	{
		int arr[][]=new int[4][];
		for(int i=0; i<=3; i++)
			arr[i]=new int[i+1];
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=i; j++)
			{
				arr[i][j]=i+j;
			}
		}
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
	
}