
public class Main {

	public static void main(String[] args) 
	{
		//Product
		Product product = new Product();
		product.id  = 1;
		product.name = "Asus Laptop";
		product.price = 10000;
		
		//Product Manager
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		//DatabaseHelper Static inner class
		DataBaseHelper.Connection.createConnection();
		DataBaseHelper.Crud.update();
		DataBaseHelper.Crud.delete();
		
	}

}
