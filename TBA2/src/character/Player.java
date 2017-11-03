package character;
import room.Room;
import utilities.Utilities;

public class Player extends Character implements CharacterInterface{
	
	public static String name;
	private String line, description;
	private int HP, AT, DF, EXP;
	private Room room;
	private int LV;
	/**
	 * @param LV : LOVE. When LV increases, maximum HP, AT, DF will increase.
	 */
	public Player(String name, String line, String description, Room room, int HP, int AT, int DF, int EXP, int LV)
	{
		super(name, line, description, room, HP, AT, DF, EXP);
		this.LV = LV;
	}
	public String getStageLine() {
		return line;
	}
	
	public static void setPlayerName(String name) {
		Player.name = name;
	}
	

	private String[]dArr = {"tired","hungry","determined","lost"};
	private String[]lArr = {"attack", "spare", "stay", "compliment", "flee","item","check","collect","follow","..."};
	
	public String print() {
		return "[ X ]";
	}


}
