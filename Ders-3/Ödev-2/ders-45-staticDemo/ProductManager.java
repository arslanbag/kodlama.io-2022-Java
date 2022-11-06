
public class ProductManager 
{
	public void add(Product product) 
	{
		if(ProductValidator.isValidProduct(product)) 
		{
			System.out.println("Eklendi");
		}
		else 
		{
			System.out.println("Ürün Bilgileri geçersiz");
		}
	
	}
}
