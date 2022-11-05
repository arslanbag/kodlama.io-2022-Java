package classes;

public class Main 
{
	public static void main(String[] args) 
	{
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		int[] sayilar1= new int[] {1,2,3};
		int[] sayilar2 = new int [] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]= 10;
		System.out.println(sayilar2[0]);
		
	}
	

}

