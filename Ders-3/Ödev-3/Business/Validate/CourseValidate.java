package Business.Validate;
import java.util.ArrayList;
import Entities.Course;

public class CourseValidate 
{
	
	//Course Name
	public static boolean reName(ArrayList<Course> courses, String courseName) 
	{
		boolean returnBoolean = false;
		for (Course course : courses ) 
		{
			if(course.getName() == courseName)
			{
				returnBoolean = true;
			}
		}
		return returnBoolean;
	}
	
	//Course Price
	public static boolean coursePrice(double coursePrice) 
	{
		return (coursePrice < 0) ? true : false; 
	}
}
