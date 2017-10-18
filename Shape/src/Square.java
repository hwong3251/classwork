

public class Square extends Rectangle {
	
    int side;

    public Square(int side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public String toString()
    {
        System.out.println("Length of a side of the square" + this.side + "Perimeter: " + this.perimeter() +"Area: " + this.area() );  
        return"";
    }

}

