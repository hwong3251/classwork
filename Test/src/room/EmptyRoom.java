package room;
import character.Player;
import runner.GameRunner;

public class EmptyRoom extends Room{
	
	private boolean occupied = false;
	private Player occupants ;
	
	public EmptyRoom(Player occupants, boolean occupied) {
		this.occupants = occupants;
		this.occupied = occupied;
	}
	
	public void print() 
	{
		if(occupied)
		{
			System.out.print("[x]");
		}
		else
		{
			System.out.print("[ ]");
		}

	}

	@Override
	public void addOccupants() {
		occupants = GameRunner.player;
		occupied = true;
	}

	@Override
	public void removeOccupants() {
		occupants = null;
		occupied = false;
	}

}
