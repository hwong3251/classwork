package runner;
import board.Board;
import character.Character;
import character.Flowey;
import character.Player;
import room.Room;

public class GameRunner {

	public static boolean GameOn = true;
	static Room[][]NewMap = new Room[8][2];
	public static void main(String[]args)
	{
		Flowey.createPlayerName();
		//Character player = new Player(Player.name, null, null, null, 100, 4, 0, 0, 0);
		while(GameOn)
		{
			for(Room[] row : NewMap)
	        {
	            for (Room room : row)
	            {
	            	 System.out.print("[ ]");
	            }
	            System.out.println("[ ]");
	        }
			
			/**Board.setMap(NewMap);
			NewMap.printMap();
			System.out.println(Player.name);	
			**/	
			GameOn = false;
			
		}
	}
	
}
