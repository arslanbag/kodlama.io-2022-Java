import interfaceAndAbstract.ICreditManager;
import interfaceAndAbstract.MilitaryCreditManager;

public class Main 
{

	public static void main(String[] args) 
	{
		//değer  tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//referans tip
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {10,20,30};
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);
		
		//creditManager
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		//Interface creditManager
		ICreditManager icreditManager = new MilitaryCreditManager(); //or teacherCreditManager
		
		//customer
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Aydın");
		
			//company
			Company company = new Company();
			company.setId(1);
			company.setCompanyName("Arslanbağ A.Ş");
			company.setCity("Aydın");
			company.setTaxNumber("10000");
			
			//person
			Person person = new Person();
			person.setId(2);
			person.setFirstName("Aykut");
			person.setLastName("Arslanbağ");
			person.setCity("Aydın");
			person.setNationalIdentity("12345");
			
			
		//customerManager
		CustomerManager customerManager = new CustomerManager(person /* or company*/, icreditManager);
		customerManager.save();
		customerManager.delete();
		customerManager.giveCredit();
		
		 
	}

}
