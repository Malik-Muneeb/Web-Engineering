import java.util.Scanner;
public class task4
{
	public static void main(String args[])
	{
		Result std1=new Result(75);
		Scanner input= new Scanner(System.in);
		System.out.println("Press 1 to see total marks\nPress 2 to see marks obtained\nPress 3 to modify marks obtained\nPress any other key to exit");
		int option=input.nextInt();
		
		while(option==1 || option==2  ||option==3)
		{
			if(option==1)
			{
				System.out.println("Total Marks: "+std1.getTotalMarks());
			}
			else if(option==2)
			{
				System.out.println("Total Marks: "+std1.getMarksObtained());
			}
			else if(option==3)
			{
				System.out.println("Enter Marks (Total: 100) : ");
				int marks=input.nextInt();
				if(marks<=100 && marks>0)
				{
					std1.setMarks(marks);
					System.out.println("Marks Changed.");
				}
				else
				{
					System.out.println("Wrong Entry");
				}
			}
			System.out.println("Press 1 to see total marks\nPress 2 to see marks obtained\nPress 3 to modify marks obtained\nPress any other key to exit");
			option=input.nextInt();
		}		
		
		
	}
}