package character;
import utilities.Utilities;
import character.Player;
import room.Room; 

public class Flowey extends Character{
	private static String name;
	private String line, description;
	private int HP, AT, DF, EXP;
	private Room room;
	
	public Flowey(String name, String line, String description, Room room, int HP, int AT, int DF, int EXP)
	{
		super(name, line, description, room , HP, AT, DF, EXP);
	}
	public static void createPlayerName()
	{
		System.out.println("Hi. My name is Flowey. What is your name?");
		String Pn = Utilities.getInput();
		System.out.println("Nice to meet you!" + Pn);
		Player.setPlayerName(Pn);
	}
	

}
