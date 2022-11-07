package Business.Validate;
import java.util.ArrayList;
import Entities.Category;

public class CategoryValidate 
{
	//Category Name
	public static boolean reName(ArrayList<Category> categories, String categoryName) 
	{
		boolean returnBoolean = false;
		for (Category category : categories ) 
		{
			if(category.getName() == categoryName)
			{
				returnBoolean = true;
			}
		}
		return returnBoolean;
	}
	
	
}
