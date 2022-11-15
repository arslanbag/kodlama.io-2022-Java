package kodlama.io.Devs.businness.concretes.validate.concretes;
import java.util.List;
import kodlama.io.Devs.businness.concretes.validate.abstracts.IEntityValidate;
import kodlama.io.Devs.businness.concretes.validate.tools.Messages;
import kodlama.io.Devs.businness.concretes.validate.tools.ValidateToolBox;

public class BaseValidateManager
{
	//ADD
	public static  boolean add(List<IEntityValidate> list,IEntityValidate item, Messages message) 
	{
		//emptyName
		if(ValidateToolBox.emptyNameCheck(item.getName()))
		{
			String empty = message.getString("emptyName","");
			message.print("errorSave",empty);	
		}
		//repeatName
		else if(ValidateToolBox.repeatNameCheck(list, item.getName()))
		{
			String repeatName = message.getString("repeatName",item.getName());
			message.print("errorSave",repeatName);	
			
		}else 
		{
			return true;
		}
			return false;
	}
	
	//UPDATE
	public static  boolean update(List<IEntityValidate> list, IEntityValidate item, Messages message) 
	{
		//emptyName
		if(ValidateToolBox.emptyNameCheck(item.getName()))
		{
			String empty = message.getString("emptyName","");
			message.print("errorUpdate",empty);	
		}
		//notFoundProgrammingLanguage
		else if(!ValidateToolBox.isLanguage(list,item.getId())) 
		{
			String isNotFound = message.getString("isNotFound", String.valueOf(item.getId()));
			message.print("errorUpdate",isNotFound);	
		}
		//repeatName
		else if(ValidateToolBox.repeatNameCheckUpdate(list, item.getName(), item.getId() ) )
		{
			String repeatName = message.getString("repeatName", item.getName());
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
	public static  boolean delete(List<IEntityValidate> list, int id, Messages message) 
	{
		//notFoundProgrammingLanguage
		if(!ValidateToolBox.isLanguage(list, id)) 
		{
			String isNotFound = message.getString("isNotFound", String.valueOf(id));
			message.print("errorDelete",isNotFound);	
			return false;
		}
			return true;
	}
	//GETBYID
	public static  boolean getById(List<IEntityValidate> list, int id, Messages message) 
	{
		//notFoundProgrammingLanguage
		if(!ValidateToolBox.isLanguage(list, id)) 
		{
			message.print("errorGet",String.valueOf(id));	
			return false;
		}
			return true;
	}
	
	
	//GETALL
	public static  boolean getAll(List<IEntityValidate> list, Messages message ) 
	{
		//notFoundProgrammingLanguage
		if(list == null) 
		{
			message.print("errorGetAll","(0 Adet)");	
			return false;
		}
			return true;
	}
}
