import interfaceAndAbstract.ICreditManager;

public class CustomerManager 
{
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) 
	{
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() 
	{
		System.out.println("Müşteri Kayıt Edildi");
	}
	
	public void delete() 
	{
		System.out.println("Müşteri Silindi id : " + customer.getId());
	}
	
	public void giveCredit() 
	{
		creditManager.calculate();
		creditManager.save();
	}
}
