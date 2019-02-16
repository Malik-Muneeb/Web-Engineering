public class task2
{	
	public static void main(String args[])
	{
		Box box=new Box();
		Box box1=new Box(4,5,6);
		Box box2=new Box(box1);
		box.print();
		box1.print();
		
		Cube cube= new Cube(7);
		System.out.println("Volume: "+cube.calcVolume());
		
	}
}