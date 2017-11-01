package character;

public abstract class Character {
	private String name, line, description;
	private int xlocation, ylocation;
	
	public Character(String name, String line, String description, int xlocation, int ylocation)
	{
		this.name = name;
		this.line = line;
		this.description = description;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
	}
	public String getName()
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

	
	public abstract String pickStageLine();
	public abstract int changexLocation();
	public abstract int changeyLocation();
}
