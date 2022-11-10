package kodlama.io.Devs.businness.concretes.validate;
import java.util.List;
import kodlama.io.Devs.entity.ProgrammingLanguage;

public class ProgramLanguageValidateManager
{
	public static  boolean emptyNameCheck(String name) 
	{
		boolean returnCheck = false;
		if(name.isEmpty() || name == null)
			returnCheck = true; 
		return returnCheck;
	}

	public static  boolean repeatNameCheck(List<ProgrammingLanguage> langues,String name) 
	{

		boolean returnCheck = false;
		for(ProgrammingLanguage arrayLanguage : langues) 
		{
			if(arrayLanguage.getName().contains(name)) 
				returnCheck = true;
		}
		return returnCheck;
	}

	public static boolean repeatNameCheckUpdate(List<ProgrammingLanguage> langues,String name, int id) 
	{
		boolean returnCheck = false;
		for(ProgrammingLanguage arrayLanguage : langues) 
		{
			if(arrayLanguage.getName().contains(name) && arrayLanguage.getId() != id)
				returnCheck = true; 
		}
		return returnCheck;
	}
	
	public static boolean isLanguage(List<ProgrammingLanguage> langues, int id) 
	{
		boolean returnCheck = false;
		for(ProgrammingLanguage arrayLanguage : langues) 
		{
			if(arrayLanguage.getId() == id)
				returnCheck = true; 
		}
		return returnCheck;
	}
	
}
