package DataAccess.Hibernate;
import DataAccess.CategoryDao;
import Entities.Category;

public class HibernateCategoryDao implements CategoryDao
{

	@Override
	public void add(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Hibernate ile Eklendi");
		
	}

	@Override
	public void update(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Hibernate ile Güncellendi");
		
	}

	@Override
	public void delete(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Hibernate ile Silindi");
		
	}


}
