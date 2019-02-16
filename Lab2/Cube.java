public class Cube extends Box
	{
		Box box;
		Cube(double length)
		{
			box=new Box(length,length,length);
		}
		
		public double calcVolume()
		{
			return box.getWidth()*box.getDepth()*box.getHeight();
		}
	}