package room;

import character.Player;
import item.Item;

import java.util.Arrays;

public abstract class Room {

    private boolean[] doors;
    private Character[] occupants;
    private Item[] items;
    
    public Character[] getOccupants() 
    {
        return occupants;
    }

    public void setOccupants(Character[] occupants) 
    {
        this.occupants = occupants;
    }
    
    public void addOccupant(Character p)
    {
        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
        this.occupants[this.occupants.length-1] = p;
      //  p.setRoom(this);
    }
    
    // public boolean[] getDoors()
    //{
    //	return doors;
    //}
    public abstract void print();
    public void print(boolean occupied)
    {
    	if(occupied)
    		System.out.print("[X]");
    	else
    		print();
    }
}
