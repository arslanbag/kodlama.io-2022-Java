package DataAccess;
import Entities.Category;

public interface CategoryDao 
{
	void add(Category category);
	void update(Category category);
	void delete(Category category);
}
