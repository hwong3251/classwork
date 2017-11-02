package character;
import utilities.Utilities;

public class Player extends Character implements CharacterInterface{
	
	private String name, line, description;
	private int xlocation, ylocation, HP, EXP;
	
	public Player(String name, String line, String description, int xlocation, int ylocation, int HP, int EXP)
	{
		super(name, line, description, xlocation, ylocation, HP, EXP);
	}
	public String getPlayerName()
	{
		System.out.println("Hi. My name is Flowey. What is your name?");
		System.out.println("Nice to meet you!" + name);
		name = Utilities.getInput();
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
