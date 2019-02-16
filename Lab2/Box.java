public class Box
{
		double width, height,depth;
		//?	Overload constructor when all dimensions specified 
		public Box(double w, double h, double d)
		{
			width=w;
			height=h;
			depth=d;
		}
		
		//?	Overload constructor for cloning an object of type “BOX” 
		public Box(Box obj)
		{
			width=obj.width;
			height=obj.height;
			depth=obj.depth;
		}
		
		public Box()
		{
			width=height=depth=0.0;
		}
		
		public void print()
		{
			System.out.println("Widht: "+width);
			System.out.println("Widht: "+height);
			System.out.println("Widht: "+depth);
		}
		
		double getWidth() { return width; }
		double getHeight() { return height; }
		double getDepth() { return depth; }
}