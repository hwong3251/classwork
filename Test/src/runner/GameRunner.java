package runner;
import board.Board;
import board.IntroMap;
import character.Character;
import character.Player;
import room.Room;

public class GameRunner {

	public static boolean GameOn = true;
	public static void main(String[]args) throws InterruptedException
	{
		Player player1 = new Player(0 , 0);
		Boolean GameOn = true;
		while(GameOn)
		{
			board.IntroMap.printMap();
			player1.chooseMove();
		}
	}

	
}
