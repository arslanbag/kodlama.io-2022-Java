
public class CustomerManager 
{
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) 
	{
		this.logger = logger;
	}
	
	public void add() 
	{
		System.out.println("Müşteri Eklendi");
		logger.log("Custom Manager Log");
	}
}
