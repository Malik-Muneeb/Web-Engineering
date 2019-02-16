public class Student implements StudentData
{
	String name;
	String rollNumber;
	double cgpa;
	
	public void setName(String name)				{ this.name=name;}
	public void setRollNumber(String rollNumber)	{ this.rollNumber=rollNumber;}
	public void setCgpa(double cgpa)				{	this.cgpa=cgpa; }
	public String getRollNumber() 					{	return rollNumber; }
	public double getCgpa()							{	return cgpa; }
	public void showData() 
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("CGPA: "+cgpa);
	}
}