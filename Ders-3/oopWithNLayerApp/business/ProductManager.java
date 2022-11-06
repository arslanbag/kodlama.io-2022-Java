package oopWithNLayerApp.business;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

import oopWithNLayerApp.core.logging.Logger;

public class ProductManager 
{
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) 
	{
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception
	{
		//iş kuralları 
		if(product.getUnitPrice() < 10)
		{
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz"); //hata fırlatılırsa uygulama durur
		}
		
		//JdbcProduct
		JdbcProductDao jdbcProductDao = new JdbcProductDao();
		jdbcProductDao.add(product);
		
		//Hibernate
		HibernateProductDao hibernateProductDao = new HibernateProductDao();
		hibernateProductDao.add(product);
		
		//implements 
		ProductDao productDaoImplements = new JdbcProductDao(); //or HHibernateProductDao();
		productDaoImplements.add(product);
		
		//implements and constructor param
		productDao.add(product);
		
		//Logger 
		for(Logger logger : loggers) 
		{
			logger.log(product.getName());
		}
	}
}
