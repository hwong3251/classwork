package character;

public abstract class Character {
	private static String name, line, description;
	private int xlocation, ylocation, HP, EXP;
	
	public Character(String name, String line, String description, int xlocation, int ylocation, int HP, int EXP)
	{
		this.name = name;
		this.line = line;
		this.description = description;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
		this.HP = HP;
		this.EXP = EXP;
	}
	public static String getName()
	{
		return name;
	}
	public String getLine()
	{
		return line;
	}
	public String getDescription()
	{
		return description;
	}
	public int getxLocation()
	{
		return xlocation;
	}
	public int getyLocation()
	{
		return ylocation;
	}


}
