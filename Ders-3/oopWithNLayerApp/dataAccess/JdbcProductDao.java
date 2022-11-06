package oopWithNLayerApp.dataAccess;
import oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao
{
	public void add(Product product) 
	{
		//sadece db erişim kodları 
		System.out.println("JDBC ile veritabanına eklendi");
	}
	

}
