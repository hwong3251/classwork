

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
        System.out.println("SQUARE " + "side:" + side + "\t" + "Perimeter:" + this.perimeter() + "\t" +"Area:" + this.area() + "\t" );  
        return"";
    }

}

