
public class Student extends Person{
	
	private String school;
	private double osis;
	private int gradelevel;
	private double GPA;
	private String[]classes;
	private String[] greetings={"Hi","TGIF"};
	public String greetings()
	{
		return "";
	}
	
	@Override
	public String toString()
	{
		return"";
	}
	public Student(String firstName, String familyName, int age, double GPA)
	{
		super(firstName, familyName, age);
		this.GPA = GPA;
	}
	
}
