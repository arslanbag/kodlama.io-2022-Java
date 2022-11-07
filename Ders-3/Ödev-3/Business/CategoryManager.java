package Business;
import java.util.ArrayList;
import Business.Validate.CategoryValidate;
import Core.Log.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

public class CategoryManager 
{
	//Field
	private Logger[] loggers;
	private CategoryDao categoryDao;
	
	public CategoryManager(Logger[] loggers, CategoryDao categoryDao) 
	{
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}

	//CategoryDao Add
	public void add(Category category, ArrayList<Category> categoryList) throws Exception
	{
		//Validate
		if(CategoryValidate.reName(categoryList, category.getName())) 
		{
			throw new Exception("Kategori adı mevcut farklı bir ad deneyiniz..");
		}
		
		//Add
		categoryDao.add(category);
		
		//log
		logBusinness("#"+category.getName()+" adlı kayıt kategorilere eklendi"); 
	
	}
	
	//CategoryDao Update
	public void update(Category category, ArrayList<Category> categoryList) throws Exception
	{
		//Validate
		if(CategoryValidate.reName(categoryList, category.getName())) 
		{
			throw new Exception("Kategori adı kullanılıyor farklı bir ad deneyiniz..");
		}
		
		//Update
		categoryDao.update(category);
		
		//log
		logBusinness("#"+category.getName()+" adlı kayıt kategorilerden güncellendi"); 
	
	}
	
	//CategoryDao Delete
	public void delete(Category category) 
	{
		//Delete
		categoryDao.delete(category);
		
		//log
		logBusinness("#"+category.getName()+" adlı kayıt kategorilerden silindi"); 
		
	}

	
	//logger
	private void logBusinness(String message) 
	{
		//Logger 
		for(Logger logger : loggers) 
		{
			logger.log(message);
		}
	}


	
	
}
