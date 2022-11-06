package oopWithNLayerApp.dataAccess;
import oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao
{
	public void add(Product product) 
	{
		//sadece db erişim kodları 
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
