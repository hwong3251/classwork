package board;

import character.Player;
import room.EmptyRoom;
import room.Room;

public class IntroMap extends Board{

	public EmptyRoom ER = new EmptyRoom(null, false);
	
	public Room[][]map = { {ER,ER,ER},
					{ER,ER,ER},
					{ER,ER,ER}	};
	
	public void printMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map.length; j++)
			{
				ER.print();
			}
			System.out.println(" ");
		}
		
	}
	
	
}
