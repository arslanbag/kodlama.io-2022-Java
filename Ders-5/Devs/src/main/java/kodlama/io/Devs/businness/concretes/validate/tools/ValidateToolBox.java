package kodlama.io.Devs.businness.concretes.validate.tools;
import java.util.List;

import kodlama.io.Devs.businness.concretes.validate.abstracts.IEntityValidate;

public class ValidateToolBox 
{
	public static  boolean emptyNameCheck(String name) 
	{
		boolean returnCheck = false;
		if(name.isEmpty() || name == null)
			returnCheck = true; 
		return returnCheck;
	}
	//RepeatName
	public static  boolean repeatNameCheck(List<IEntityValidate> list,String name) 
	{

		boolean returnCheck = false;
		for(IEntityValidate arrayItem : list) 
		{
			if(arrayItem.getName().contains(name)) 
				returnCheck = true;
		}
		return returnCheck;
	}
	//RepeatNameUpdate
	public static boolean repeatNameCheckUpdate(List<IEntityValidate> list,String name, int id) 
	{
		boolean returnCheck = false;
		for(IEntityValidate arrayItem : list) 
		{
			if(arrayItem.getName().contains(name) && arrayItem.getId() != id)
				returnCheck = true; 
		}
		return returnCheck;
	}
	//İs
	public static boolean isLanguage(List<IEntityValidate> list, int id) 
	{
		boolean returnCheck = false;
		for(IEntityValidate arrayItem : list) 
		{
			if(arrayItem.getId() == id)
				returnCheck = true; 
		}
		return returnCheck;
	}
	
	
}
