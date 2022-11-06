package oopWithNLayerApp.entities;

public class Product 
{
	private int id;
	private String name;
	private double unitPrice;
	
	//constructor
	public Product() 
	{
		super();
	}
	
	//constructor Params
	public Product(int id, String name, double unitPrice)
	{
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
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

	//name
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	//getUnitPrice
	public double getUnitPrice() 
	{
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) 
	{
		this.unitPrice = unitPrice;
	}

}
