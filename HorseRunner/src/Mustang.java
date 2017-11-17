
public class Mustang implements Horse {
	
	private String name;
	private int weight;
	
	public Mustang(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

}
