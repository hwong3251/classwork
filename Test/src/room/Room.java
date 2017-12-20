package room;

import character.Player;

import java.util.Arrays;

public abstract class Room {
	private boolean occupied;
    private Character[] occupants ;
    
    public Room(Character[]occupants, boolean occupied)
    {
    	this.occupants = occupants;
    	this.occupied = occupied;
    }
    
    public abstract void print();

	public abstract void addOccupants(Character x);
    
}
