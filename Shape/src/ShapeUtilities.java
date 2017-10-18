import java.util.Random;

public class ShapeUtilities {
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new Circle(r.nextInt(100));
			case 1:
				return new Rectangle(r.nextInt(50),r.nextInt(50));
			case 2:
				return new Square(r.nextInt(50));
			default:
				return new Circle(r.nextInt(100));
		}
	}
	public static double sumPeri(Shape[]shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			x = shapeArr[i].perimeter()+x;
		}
		return x;
	}
	public static double sumArea(Shape[]shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			x = shapeArr[i].area()+x;
		}
		return x;
	}
}
