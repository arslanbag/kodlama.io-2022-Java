
public class ProductValidator //Ana class static olamaz
{
	//statick kullanım için
	static 
	{
		System.out.println("Static kullanımda çalışan blok1");
	}
	static 
	{
		System.out.println("Static kullanımda çalışan blok2");
	}
	
	//yapıcı blok
	public ProductValidator() 
	{
		System.out.println("Static kullanımda yapıcı block çalışmaz");
	}

	//Ürün kontrol
	public static boolean isValidProduct(Product product) 
	{
		return (product.price > 0 && !product.name.isEmpty());
	}
	
	//innerClass
	public static class innerClass //Alt class'lar static olabilir
	{
		
	}
}
