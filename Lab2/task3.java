import java.util.Scanner;
public class task3
{
	public static void main(String args[])
	{
		Student std[]=new Student[3];
		std[0]=new Student("Sher","BCSF15M012", "NUST");
		std[1]=new Student("Shaheryar", "BCSF15M039", "FAST");
		std[2]=new Student("Muneeb", "BCSF15M030","FAST");
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Uni Name: ");
		String uniName=input.next();
		
		Student.changeUni(uniName);
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Stdent # " +i);
			System.out.println("");
			System.out.println("Name: "+std[i].getName());
			System.out.println("Name: "+std[i].getRollNo());
			System.out.println("Name: "+std[i].getUniName());
			System.out.println("");
		}
	}
}