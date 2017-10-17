
public class ShapeRunner {
	public static void main(String[]args)
	{
		Rectangle rectangle1 = new Rectangle(5,3);
		Circle circle1 = new Circle(3);
		if(rectangle1.perimeter()>circle1.perimeter())
		{
			System.out.println("Longer Perimeter: Rectangle");
		}
		else if(circle1.perimeter()>rectangle1.perimeter())
		{
			System.out.println("Longer Perimeter: Circle");
		}
		else
		{
			System.out.println("Their Perimeter are equal");
		}
	}
}
