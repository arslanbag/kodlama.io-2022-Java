package kodlama.io.Devs.backup;
import java.util.List;

import kodlama.io.Devs.businness.concretes.validate.tools.Messages;
import kodlama.io.Devs.entity.ProgrammingLanguage;

public class ProgramLanguageValidateManager
{
	//ADD
	public static  boolean add(List<ProgrammingLanguage> langues,ProgrammingLanguage language, Messages message) 
	{
		//emptyName
		if(emptyNameCheck(language.getName()))
		{
			String empty = message.getString("emptyName","");
			message.print("errorSave",empty);	
		}
		//repeatName
		else if(repeatNameCheck(langues, language.getName()))
		{
			String repeatName = message.getString("repeatName",language.getName());
			message.print("errorSave",repeatName);	
			
		}else 
		{
			return true;
		}
			return false;
	}
	
	//UPDATE
	public static  boolean update(List<ProgrammingLanguage> langues, ProgrammingLanguage language, Messages message) 
	{
		//emptyName
		if(emptyNameCheck(language.getName()))
		{
			String empty = message.getString("emptyName","");
			message.print("errorUpdate",empty);	
		}
		//notFoundProgrammingLanguage
		else if(!isLanguage(langues,language.getId())) 
		{
			String isNotFound = message.getString("isNotFound", String.valueOf(language.getId()));
			message.print("errorUpdate",isNotFound);	
		}
		//repeatName
		else if(repeatNameCheckUpdate(langues,  language.getName(), language.getId() ) )
		{
			String repeatName = message.getString("repeatName", language.getName());
			message.print("errorUpdate",repeatName);	
		}
		//update
		else 
		{
			return true;
		}
			return false;
		
	}
	//DELETE
	public static  boolean delete(List<ProgrammingLanguage> langues, int id, Messages message) 
	{
		//notFoundProgrammingLanguage
		if(!isLanguage(langues, id)) 
		{
			String isNotFound = message.getString("isNotFound", String.valueOf(id));
			message.print("errorDelete",isNotFound);	
			return false;
		}
			return true;
	}
	//GETBYID
	public static  boolean getById(List<ProgrammingLanguage> langues, int id, Messages message) 
	{
		//notFoundProgrammingLanguage
		if(!isLanguage(langues, id)) 
		{
			message.print("errorGet",String.valueOf(id));	
			return false;
		}
			return true;
	}
	
	//GETALL
	public static  boolean getAll(List<ProgrammingLanguage> langues, Messages message ) 
	{
		//notFoundProgrammingLanguage
		if(langues == null) 
		{
			message.print("errorGetAll","(0 Adet)");	
			return false;
		}
			return true;
	}
	
	//TOOLS
	//Empty
	public static  boolean emptyNameCheck(String name) 
	{
		boolean returnCheck = false;
		if(name.isEmpty() || name == null)
			returnCheck = true; 
		return returnCheck;
	}
	//RepeatName
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
	//RepeatNameUpdate
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
	//İs
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
