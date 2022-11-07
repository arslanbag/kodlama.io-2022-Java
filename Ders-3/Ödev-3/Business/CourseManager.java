package Business;
import java.util.ArrayList;
import Business.Validate.CourseValidate;
import Core.Log.Logger;
import DataAccess.CourseDao;
import Entities.Course;

public class CourseManager 
{
	//Field 
	Logger[] loggers; 
	CourseDao coursedoa;
	
	public CourseManager( Logger[] loggers, CourseDao coursedoa) 
	{
		this.coursedoa = coursedoa;
		this.loggers = loggers;
	}
	
	//Course Add
	public void add(Course course, ArrayList<Course> courseList) throws Exception
	{
		//Validate Name
		if(CourseValidate.reName(courseList, course.getName())) 
		{
			throw new Exception("Kurs adı mevcut farklı bir ad deneyiniz..");
		}
		
		//Validate Price
		if(CourseValidate.coursePrice(course.getPrice())) 
		{
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		//Add
		coursedoa.add(course);
		
		//log
		logBusinness("#"+course.getName()+" adlı kayıt kurs listesine eklendi"); 
	
	}
	
	//Course Update
	public void update(Course course, ArrayList<Course> courseList) throws Exception
	{
		//Validate
		if(CourseValidate.reName(courseList, course.getName())) 
		{
			throw new Exception("Kurs adı kullanılıyor farklı bir ad deneyiniz..");
		}
		
		//Validate Price
		if(CourseValidate.coursePrice(course.getPrice())) 
		{
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		//Update
		coursedoa.update(course);
		
		//log
		logBusinness("#"+course.getName()+" adlı kayıt kurs listesinde güncellendi"); 
	
	}
	
	//Course Delete
	public void delete(Course course) 
	{
		//Delete
		coursedoa.delete(course);
		
		//log
		logBusinness("#"+course.getName()+" adlı kayıt kurs listesinden silindi"); 
		
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
