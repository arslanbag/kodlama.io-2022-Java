package Core.Log;

public class ConsoleLogger implements Logger
{

	@Override
	public void log(String message) 
	{
		System.out.println("@Konsol'a log kaydı işlendi :: " + message);
	}

}
