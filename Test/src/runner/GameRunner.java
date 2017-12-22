package runner;
import board.Board;
import board.IntroMap;
import character.Character;
import character.Player;
import room.Room;

public class GameRunner {

	public static boolean GameOn = true;
	public static Player player = new Player(0 , 0);
	public static IntroMap test1= new IntroMap();
	
	public static Board currentMap = test1;
	
	public static void main(String[]args) throws InterruptedException
	{
		Boolean GameOn = true;
		
		while(GameOn)
		{
			currentMap.updateMap();
			currentMap.printMap();
			player.chooseMove();
		}
	}

	
}
