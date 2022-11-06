package interfaces;

public class CustomerManager 
{
	private ICustomerDal customerdal;
	
	public CustomerManager(ICustomerDal customerdal) 
	{
		this.customerdal = customerdal;
	}
	
	public void add() 
	{
		//iş kodları
		customerdal.add();
	}
}
