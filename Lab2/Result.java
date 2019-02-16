public class Result
{
	int totalMarks=100;
	int marksObtained;
	
	Result(int marksObtained)
	{
		this.marksObtained=marksObtained;
	}
	
	public int getTotalMarks() { return totalMarks; }
	public int getMarksObtained() { return marksObtained;}
	public void setMarks(int marks) {	marksObtained=marks; }
	
}