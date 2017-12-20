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
		IntroMap test1= new IntroMap();
		while(GameOn)
		{
			test1.printMap();
			player1.chooseMove();
		}
	}

	
}
