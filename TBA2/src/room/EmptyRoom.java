package room;

import item.Item;

public class EmptyRoom extends Room{
	private Character[] occupants;
	private Item[] items;
	public EmptyRoom(Character[] occupants, Item[] items) {
		super(null, null);
	}

	public void print() 
	{
		System.out.print("[ ]");
	}

}
