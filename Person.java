public class Person
{
	String first;
	String other;
	String surname;
	
	public Person()
	{
		
	}
	public Person(String First, String surname)
	{
		this.first = First;
		this. surname = surname;
	}
	public String firstName()
	{
		return first;
	}
	public String otherName()
	{
		return other;		
	}
	public String surname()
	{
		return surname;
	}
	pubic void firstName(String firstName)
	{
		first=firstName;
	}
	pubic void otherName(String otherName)
	{
		other=otherName;
	}
	pubic void surname(String surname)
	{
		surname=surname;
	}
	public int getAge()
	{
	
	}
}