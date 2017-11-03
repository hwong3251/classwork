package runner;
import board.Board;
import character.Character;
import character.Flowey;
import character.Player;

public class GameRunner {

	public static boolean GameOn = true;
	
	public static void main(String[]args)
	{
		Flowey.createPlayerName();
		System.out.println(Player.name);
		Character player = new Player(Player.name, null, null, null, 100, 4, 0, 0, 0);
		while(GameOn)
		{
			System.out.println(Player.name);
			Board.printMap();
			GameOn = false;
			
		}
	}
	
}
