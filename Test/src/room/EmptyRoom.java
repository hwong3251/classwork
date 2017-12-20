package room;


public class EmptyRoom extends Room{
	
	private boolean occupied = false;
	private Character occupants ;
	
	public EmptyRoom(Character[] occupants, boolean occupied) {
		super(occupants, false);
	}
	
	public void print() 
	{
		if(occupied)
		{
			System.out.print("[x]");
		}
		System.out.print("[ ]");
	}

	@Override
	public void addOccupants(Character x) {
		occupants = x;
		occupied = true;
	}

}
