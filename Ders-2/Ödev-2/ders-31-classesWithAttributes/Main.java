package classesWithAttributes;

public class Main 
{

	public static void main(String[] args) 
	{
		Product productParametreli = new Product(1,"Laptop","Asus Laptop2",3000,2,"Siyah");
		Product productParametresiz = new Product();
		productParametresiz.setName("Laptop");
		productParametresiz.setId(1);
		productParametresiz.setPrice(5000);
		productParametresiz.setStockAmount(5);
		
		System.out.println(productParametresiz.getName());
		System.out.println(productParametresiz.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(productParametresiz);
		productManager.Add(productParametreli);

	}

}
