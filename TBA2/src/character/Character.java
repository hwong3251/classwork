package character;

import room.Room;

public abstract class Character {
	public static String name, line, description;
	private int HP, AT, DF, EXP;
	private Room room;
	
	/** 
	 * @param name : name of character. Player can create their own name.
	 * @param line : character's quotes / lines in the game
	 * @param description : the physical description of the character
	 * @param xlocation : x location of character in the board
	 * @param ylocation : y location of character in the board
	 * @param HP : Hit Point, 0 HP = game over / dead
	 * @param AT : Attack. Strength of fight option in combat(player)
	 * @param DF : Defense. Reduces amount of HP you lose
	 * @param EXP: EX Points. Gained by defeating enemies(player)/ Amount of EXP a character has. 
	 */
	public Character(String name, String line, String description, Room room, int HP, int AT, int DF, int EXP)
	{
		this.name = name;
		this.line = line;
		this.description = description;
		this.room = room;
		this.HP = HP;
		this.AT = AT;
		this.DF = DF;
		this.EXP = EXP;
	}
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) 
	{
		this.room = room;
	}
}
