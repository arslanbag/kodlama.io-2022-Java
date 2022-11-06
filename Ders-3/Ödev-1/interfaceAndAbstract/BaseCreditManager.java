package interfaceAndAbstract;

public abstract class BaseCreditManager implements ICreditManager
{
	@Override
	public void save() 
	{
		System.out.println("Kredi Kayıt Edildi");
	}

}
