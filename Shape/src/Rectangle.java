
public class Rectangle implements Shape{
	//fields
	private double length;
	private double width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double perimeter()
	{
		return 2*(length+width);
	}
	public double area()
	{
		return length*width;
	}
	@Override
	public String toString() {
		System.out.println("RECTANGLE "+ "Width:" + width + "\t" + "Length:" + length + "\t"+ "Area:" + this.area() + "\t");
		return "";
	}
}
