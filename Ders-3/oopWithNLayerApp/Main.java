package oopWithNLayerApp;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;
import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.MailLogger;



public class Main {

	public static void main(String[] args) throws Exception 
	{
		//Loggers
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		//Product
		Product product1 = new Product(1,"Iphone Xr",10000);
		
		//Product Manager
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		
		//Add database 
		productManager.add(product1);
	}

}
