package DataAccess.Jbdc;
import DataAccess.CategoryDao;
import Entities.Category;

public class JbdcCategoryDao implements CategoryDao
{

	@Override
	public void add(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Jbdc ile Eklendi");
		
	}

	@Override
	public void update(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Jbdc ile Güncellendi");
		
	}

	@Override
	public void delete(Category category) 
	{
		System.out.println("#-"+category.getName()+" adlı Kategori Jbdc ile Silindi");
		
	}


}
