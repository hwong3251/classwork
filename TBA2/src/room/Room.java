package room;

import character.Player;
import item.Item;

import java.util.Arrays;

public abstract class Room {
    private Character[] occupants;
    private Item[] items;
    
    public Room(Character[]occupants, Item[]items)
    {
    	this.occupants = occupants;
    	this.items = items;
    }
    
    public Character[] getOccupants() 
    {
        return occupants;
    }

    public void setOccupants(Character[] occupants) 
    {
        this.occupants = occupants;
    }
    
    public abstract void print();
    
    public void print(boolean occupied)
    {
    	if(occupied)
    		System.out.print("[X]");
    	else
    		print();
    }
}
