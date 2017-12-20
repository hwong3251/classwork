package board;
import room.Room;
import character.Player; 
public abstract class Board {
	
    private static Room[][] map;
    private Boolean isOccupied; 
	public static void setMap(Room[][] map) 
	{
        Board.map = map;
    }
	public abstract void printMap();
    
}
