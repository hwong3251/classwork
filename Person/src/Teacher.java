
public class Teacher extends Person{
	
	private int salary;
	private String subject;
	private String prefix;
	private Student[][]Classes;
	private static String[] greetings = {"HI", "Hello"};
	public Teacher(String firstName, String familyName, int age, String subject, String prefix)
	{
		super(firstName, familyName, age);
		this.subject = subject;
		this.prefix = prefix;
	}
	public String greeting()
	{
		return "";
	}
	
	@Override
	public String toString()
	{
		return"";
	}
}
