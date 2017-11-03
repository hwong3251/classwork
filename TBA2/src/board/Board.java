package board;

import room.EmptyRoom;
import room.Room;

public class Board {
	
    private static Room[][] map;
    
    public Board(Room[][] map)
    {
        this.map = map;
    }

    public static void printMap()
    {
        for(Room[] row : map)
        {
            for (Room room : row)
            {
                room.print(false);
            }
            System.out.println("[ ]");
        }
    }


	public static void setMap(Room[][] map) {
        Board.map = map;
    }
    public Room[][] getMap() {
        return map;
    }
    
}
