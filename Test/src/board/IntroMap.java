package board;

import character.Player;
import room.EmptyRoom;
import room.Room;

public class IntroMap{

	public EmptyRoom ER = new EmptyRoom(null, false);
	public EmptyRoom ERR = new EmptyRoom(null, true);
	public Room[][]map = { {ERR,ER,ER},
					{ER,ER,ER},
					{ER,ER,ER}	};
	public void printMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map.length; j++)
			{
				if(i==0&&j==0)
				{
					ERR.print();
				}
				else
				ER.print();
			}
			System.out.println(" ");
		}
		
	}
	
	
}
