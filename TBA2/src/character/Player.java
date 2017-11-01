package character;

public class Player extends Character implements CharacterInterface{
	
	private String name, line, description;
	private int xlocation, ylocation;
	
	public Player(String name, String line, String description, int xlocation, int ylocation)
	{
		super(name)
	}
	@Override
	public String pickStageLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int changexLocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeyLocation() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
