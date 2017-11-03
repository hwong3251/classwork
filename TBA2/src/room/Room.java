package room;

import character.Player;
import item.Item;

import java.util.Arrays;

public abstract class Room {

    private boolean[] doors;
    private Character[] occupants;
    private Item[] items;
    private int x, y;

    public Room (boolean[] doors, Character[] occupants, Item[] items, int x, int y)
    {
    	this.x = x;
    	this.y = y;
        this.doors = doors;
        this.occupants = occupants;
        this.items = items;
        this.explored = explored;
    }

    public Person[] getOccupants() 
    {
        return occupants;
    }

    public void setOccupants(Person[] occupants) 
    {
        this.occupants = occupants;
    }
    
    public void addOccupant(Person p)
    {
        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
        this.occupants[this.occupants.length-1] = p;
        p.setRoom(this);
    }
    
    public void setExplored(boolean explored) 
    {
        this.explored = explored;
    }
    
    public boolean[] getDoors()
    {
    	return doors;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    
    public void removeEnemy()
	{
		Person[] replace = new Person[this.occupants.length - 1];
		for (int i = 0; i < replace.length; i++)
		{
			if (this.getOccupants()[i] instanceof Enemy)
			{
				continue;
			}
			replace[i] = this.getOccupants()[i];
		}
		this.occupants = replace;
	}
    
    public void removeLastPerson()
	{
		Person[] replace = new Person[this.occupants.length - 1];
		for (int i = 0; i < replace.length; i++)
		{
			replace[i] = this.getOccupants()[i];
		}
		this.occupants = replace;
	}
	public void addPerson(Person addition)
	{
		Person[] replace = new Person[this.occupants.length + 1];
		for (int i = 0; i < replace.length; i++)
		{
			replace[i] = this.occupants[i];
		}
		replace[replace.length - 1] = addition;
		this.occupants = replace;
	}
    
    public abstract void print();
}
