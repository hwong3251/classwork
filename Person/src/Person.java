
public abstract class Person {
	
	private String firstName, familyName, birthplace, birthdate;
	private int age;
	int ssn;
	public int CalculateAge;
	public abstract String greeting();
	
	public Person(String firstName, String familyName, int age)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
	}
	//Getters
	public String getFirstName()
	{
		return firstName;
	}
	public String getFamilyNAme()
	{
		return familyName;
	}
}
 