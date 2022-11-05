package oop1;

public class CorporateCustomer extends Customer
{
	private String componyName;
	private String taxNumber;
	
	public String getComponyName() 
	{
		return componyName;
	}
	
	public void setComponyName(String componyName) 
	{
		this.componyName = componyName;
	}
	
	public String getTaxNumber() 
	{
		return taxNumber;
	}
	
	public void setTaxNumber(String taxNumber) 
	{
		this.taxNumber = taxNumber;
	}
	
}
