
public class Circle implements Shape{
	//fields
	private double radius;
	private static  double pi=3.14;
	public Circle(double rad)
	{
		this.radius=rad;
	}
	public double periemter()
	{
		return 2*rad*pi;
	}
	public double area()
	{
		return rad*rad*pi;
	}
}
