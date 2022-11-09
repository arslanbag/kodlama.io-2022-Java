package Businness.ValidateManager;
import Businness.Services.UserValidationServices;
import Entity.Gamer;

public class NewEStateUserValidationManager implements UserValidationServices
{

	@Override
	public boolean validate(Gamer gamer) 
	{
		return true;
	}

}
