
public class ShapeUtilities {
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new Circle(r.nextInt(100)+1);
			case 1:
				return
			default:
				return
		}
	}
	public static double sumPeri(Shape[]shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length(); i++)
		{
			x = shapeArr[i].perimeter()+x;
		}
		return x;
	}
	public static double sumArea(Shape[]shapeArr)
	{
		double x = 0;
		for(int i = 0; i < shapeArr.length(); i++)
		{
			x = shapeArr[i].area()+x;
		}
		return x;
	}
}
