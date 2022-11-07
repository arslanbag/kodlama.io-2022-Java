package Entities;

public class Instructor 
{
	//field
	int id;
	String name; 
	String lastName; 
	
	//Constructor Parameter
	public Instructor(int id, String name, String lastName) 
	{
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	//Constructor
	public Instructor() {}

	//id
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	//name
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
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

}
