package character;
import java.util.Scanner;

import room.Room;
import utilities.Utilities;

public class Player extends Character{
	
	public int x;
	public int y;
	/**
	 * @param x y: position of player.
	 */
	public Player( int x , int y)
	{
		super(x,y);
	}
	//set limit to where player can go in the map. 
	/*
	public void moveLimit()
	{
		if(y > Map1.boardSize-1)
		{
			System.out.print("You cannot move this way.\n");
			y -=1;	
		}
        if(y < 0)
        {
        	System.out.print("You cannot move this way.\n");
      		y +=1;
        }
        if(x> Map1.boardSize-1)
        {
        	System.out.print("You cannot move this way.\n"); 
        	x -=1;
        }
        if(x < 0)
        {
        	System.out.print("!! You cannot move this way. !!\n");  
      		x +=1;
        }  
	}
	*/
	//player movement control
	public void chooseMove()
	{
		System.out.println("Where do you want to go?");		
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();	
		if (response.equals("w"))
		{
			this.y -= 1;
		}
		else if (response.equals("s"))
		{
			this.y += 1;
		}
		else if (response.equals("d"))
		{
			this.x += 1;
		}
		else if (response.equals("a"))	
		{
			this.x -= 1 ;
		}
		else
		{
			System.out.println("Choose w(up),a(left),s(down),or d(right)");
		}
		//moveLimit();
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
}
