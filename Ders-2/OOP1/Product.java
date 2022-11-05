package oop1;

public class Product 
{
	//field , camelCase yazılır
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	
	//name Get Set
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//unitPrice Get Set
	public double getUnitPrice() 
	{
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) 
	{
		this.unitPrice = unitPrice;
	}
	
	//discount Get Set
	public double getDiscount() 
	{
		return discount;
	}
	
	public void setDiscount(double discount) 
	{
		this.discount = discount;
	}
	
	//getImageUrl Get Set
	public String getImageUrl() 
	{
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) 
	{
		this.imageUrl = imageUrl;
	}
	
	//unitsInStock Get Set
	public int getUnitsInStock() 
	{
		return unitsInStock;
	}
	
	public void setUnitsInStock(int unitsInStock) 
	{
		this.unitsInStock = unitsInStock;
	}
	
}
