
public class Main 
{

	public static void main(String[] args) 
	{
		//baselog childs
		BaseLogger[]  loggers = new BaseLogger[] 
		{
			new EmailLogger(), 
			new FileLogger(), 
			new DatabaseLogger(),
			new ConsoleLogger()
		};
		
		//loggers each
		for(BaseLogger arrayLog : loggers) 
		{
			arrayLog.log("Log Mesaj");
		}
		
		//customerManager logger
		CustomerManager customerManager = new CustomerManager(new EmailLogger()); // veya diğer loggerlardan biri yada loggers[index]
		customerManager.add();
	}

}
