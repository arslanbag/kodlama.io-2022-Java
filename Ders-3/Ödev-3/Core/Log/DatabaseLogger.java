package Core.Log;

public class DatabaseLogger implements Logger
{
	@Override
	public void log(String message) 
	{
		System.out.println("@Veritabanına log kaydı işlendi :: " + message);
	}

}
