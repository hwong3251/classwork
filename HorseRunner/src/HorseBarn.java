
public class HorseBarn {
	
	private Horse[] spaces;
	
	public HorseBarn(Horse[] horses) {
		// TODO Auto-generated constructor stub
		this.spaces = horses;
	}
	public int findHorseSpace(String name)
	{
		int n = -1;
		for(int i = 0; i < this.spaces.length; i++)
		{
			if(this.spaces[i] != null && name.equals(this.spaces[i].getName()))
			{
				n = i;
			}
		}
		return n;
	}
	public void consolidate()
	{
		for(int i = 0; i < this.spaces.length-1; i++)
		{
			if(this.spaces[i] == null)
			{
				for(int j = i+1; j < this.spaces.length; j++)
				{
					if(this.spaces[j] != null)
					{
						this.spaces[i] = this.spaces[j];
						this.spaces[j] = null;
						j = this.spaces.length;
					}
				}
			}
		}
	}
	public String toString()
	{
		for(int i = 0; i < this.spaces.length; i++)
		{
			if(this.spaces[i] != null)
				System.out.print("[" + spaces[i].getName() + "] ");
			else
				System.out.print("[null] ");
		}
		return "";
	}
}
