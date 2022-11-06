package interfaces;

public class Main 
{

	public static void main(String[] args) 
	{
		//Dal - DBACCESS
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
		
		//Manager - BUSINESS
		CustomerManager customermanager = new CustomerManager(new OracleCustomerDal());
		customermanager.add();
	}
}
