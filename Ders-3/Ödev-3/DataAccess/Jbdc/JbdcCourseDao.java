package DataAccess.Jbdc;
import DataAccess.CourseDao;
import Entities.Course;

public class JbdcCourseDao implements CourseDao
{
	@Override
	public void add(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Jbdc ile Eklendi");
	}

	@Override
	public void update(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Jbdc ile Güncellendi");
	}

	@Override
	public void delete(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Jbdc ile Silindi");	
	}



}
