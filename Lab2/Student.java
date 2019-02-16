public class Student
{
	String name;
	String rollNo;
	static String uniName;
	
	Student(String name, String rollNo, String uniName)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.uniName=uniName;
	}
	
	public static void changeUni(String name)
	{
		uniName=name;
	}
	
	String getName() {	return name; }
	String getRollNo() {	return rollNo; }
	String getUniName() {	return uniName; }
}