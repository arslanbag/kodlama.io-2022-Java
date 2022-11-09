package Businness.ValidateManager;
import Businness.Services.UserValidationServices;
import Entity.Gamer;

public class UserValidationManager implements UserValidationServices
{

	@Override
	public boolean validate(Gamer gamer) 
	{
		if(gamer.birthYear == 1995 && 
			gamer.firstName == "Aykut" && 
				gamer.lastName == "Arslanbağ" && 
					gamer.identityNumber == (long)12345) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	

}
