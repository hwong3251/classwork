package character;
import utilities.Utilities;

public class Player extends Character implements CharacterInterface{
	
	private static String name;
	private String line;
	private String description;
	private int xlocation, ylocation, HP, EXP;
	
	public Player(String name, String line, String description, int xlocation, int ylocation, int HP, int EXP)
	{
		super(name, line, description, xlocation, ylocation, HP, EXP);
	}
	public static String getPlayerName()
	{
		System.out.println("Hi. My name is Flowey. What is your name?");
		name = Utilities.getInput();
		System.out.println("Nice to meet you!" + name);

		return Player.getName();
	}
	public String pickStageLine() {
		// TODO Auto-generated method stub
		return null;
	}
	public int changexLocation() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int changeyLocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
