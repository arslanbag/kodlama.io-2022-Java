package Business;
import Core.Log.Logger;
import DataAccess.InstructorDao;
import Entities.Instructor;

public class InstructorManager 
{
	//Field 
	Logger[] loggers; 
	InstructorDao instructorDao;
	
	public InstructorManager(Logger[] loggers, InstructorDao instructorDao) {
		super();
		this.loggers = loggers;
		this.instructorDao = instructorDao;
	}

	//Instructor 
	public void add(Instructor instructor)
	{
		//Add
		instructorDao.add(instructor);
		
		//log
		logBusinness("#"+instructor.getName()+"-"+instructor.getLastName()+"  adlı kayıt eğitmen listesine eklendi"); 
	
	}
	
	//Course Update
	public void update(Instructor instructor)
	{
		
		//Update
		instructorDao.update(instructor);
		
		//log
		logBusinness("#"+instructor.getName()+"-"+instructor.getLastName()+"  adlı kayıt eğitmen listesinden silindi"); 
	
	}
	
	//Course Delete
	public void delete(Instructor instructor) 
	{
		//Delete
		instructorDao.delete(instructor);
		
		//log
		logBusinness("#"+instructor.getName()+"-"+instructor.getLastName()+"  adlı kayıt eğitmen listesine eklendi"); 
		
	}
	
	//logger
	private void logBusinness(String message) 
	{
		//Logger 
		for(Logger logger : loggers) 
		{
			logger.log(message);
		}
	}
	
}
