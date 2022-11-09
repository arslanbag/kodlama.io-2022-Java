package Entity;

public class Gamer 
{
	public int id;
	public String firstName;
	public String lastName;
	public int birthYear;
	public long identityNumber;
	
	//constructorParameters 
	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber) 
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}
	
	//id
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	//firstName
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	//lastName
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	//birhYear
	public int getBirthYear() 
	{
		return birthYear;
	}
	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
	
	//identityNumber
	public long getIdentityNumber() 
	{
		return identityNumber;
	}
	public void setIdentityNumber(long identityNumber) 
	{
		this.identityNumber = identityNumber;
	}
	


	
}
