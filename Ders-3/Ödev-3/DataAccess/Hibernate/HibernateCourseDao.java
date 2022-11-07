package DataAccess.Hibernate;
import DataAccess.CourseDao;
import Entities.Course;

public class HibernateCourseDao implements CourseDao
{

	@Override
	public void add(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Hibernate ile Eklendi");
	}

	@Override
	public void update(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Hibernate ile Güncellendi");
	}

	@Override
	public void delete(Course course) 
	{
		System.out.println("#-"+course.getName()+" adlı Kurs Hibernate ile Silindi");	
	}

	
}
