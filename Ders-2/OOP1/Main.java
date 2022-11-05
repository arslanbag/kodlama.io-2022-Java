package oop1;

public class Main {

	public static void main(String[] args)
	{
		//create Class
		Product product = new Product();
		
		//set Value
		product.setName("Kahve Makinesi");
		product.setDiscount(7);
		product.setUnitPrice(7500);
		product.setUnitsInStock(3);
		product.setImageUrl("product.jpg");
		
		
		//get Value
		System.out.println(product.getName());
		
		//products 
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("product1_name.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("product2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("product3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		//for each 
		for(Product arrayProduct : products) 
		{
			System.out.println(arrayProduct.getName());
		}
		
		//individualCustomer
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05551112233");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Aykut");
		individualCustomer.setLastName("Arslanbağ");
		
		//CorparateCustomer
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("05551112233");
		corporateCustomer.setCustomerNumber("12345");
		corporateCustomer.setComponyName("Arslanbağ A.ş");
		corporateCustomer.setTaxNumber("1122334455");
		
		//Merge Customer
		Customer[] customer = {individualCustomer, corporateCustomer};
		
	}

}
