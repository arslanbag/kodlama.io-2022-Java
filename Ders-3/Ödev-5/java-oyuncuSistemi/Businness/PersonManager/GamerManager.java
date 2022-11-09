package Businness.PersonManager;
import Businness.Services.GamerServices;
import Businness.Services.UserValidationServices;
import Entity.Gamer;

public class GamerManager implements GamerServices
{
	//field
	UserValidationServices userValidationServices;
	
	//constructor
	public GamerManager(UserValidationServices userValidationServices) 
	{
		this.userValidationServices = userValidationServices;
	}

	@Override
	public void add(Gamer gamer) 
	{
		if(userValidationServices.validate(gamer)) 
		{
			System.out.println("Kayıt Eklendi");
		}
		else 
		{
			System.out.println("Kimlik doğrulanamdı, kayıt başarısız");
		}
		
	}

	@Override
	public void update(Gamer gamer) 
	{
		System.out.println("Güncellenme Başarılı");
	
	}

	@Override
	public void delete(Gamer gamer) 
	{
		System.out.println("Kayıt Silindi");	
	}

}
