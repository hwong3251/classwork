
public class Circle implements Shape{
	//fields
	private double radius;
	private static  double pi=3.14;
	public Circle(double rad)
	{
		this.radius=rad;
	}
	public double perimeter()
	{
		return 2*radius*pi;
	}
	public double area()
	{
		return radius*radius*pi;
	}
	@Override
	public String toString() {
		System.out.println("CIRCLE "+ "Radius:" + radius + "\t" + "Circumference:"+ this.perimeter() + "\t" + "Area:" + this.area() + "\t");
		return "";
	}
}
