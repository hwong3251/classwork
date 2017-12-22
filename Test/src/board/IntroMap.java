package board;

import character.Player;
import room.EmptyRoom;
import room.Room;
import runner.GameRunner;

public class IntroMap extends Board{

	public EmptyRoom ER0 = new EmptyRoom(null, false);
	public EmptyRoom ER1 = new EmptyRoom(null, false);
	public EmptyRoom ER2 = new EmptyRoom(null, false);
	public EmptyRoom ER3 = new EmptyRoom(null, false);
	public EmptyRoom ER4 = new EmptyRoom(null, false);
	public EmptyRoom ER5 = new EmptyRoom(null, false);
	public EmptyRoom ER6 = new EmptyRoom(null, false);
	public EmptyRoom ER7 = new EmptyRoom(null, false);
	public EmptyRoom ER8 = new EmptyRoom(null, false);
	
	public Room[][]map = { {ER0,ER1,ER2},
						   {ER3,ER4,ER5},
						   {ER6,ER7,ER8}	};
	
	private int boardSize = 3;
	
	@Override
	public void updateMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map[i].length; j++)
			{
				if(i==Player.getX() && j==Player.getY())
				{
					map[i][j].addOccupants();
				}
				else
				{
					map[i][j].removeOccupants();
				}
			}
		}
	}
	
	public void printMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map[i].length; j++)
			{
				map[i][j].print();
			}
			System.out.println(" ");
		}
	}
	
	public int getBoardSize()
	{
		return this.boardSize;
	}

	
}
