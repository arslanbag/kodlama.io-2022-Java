package DataAccess.Hibernate;
import DataAccess.InstructorDao;
import Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao
{

	@Override
	public void add(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitimen Hibernate ile Eklendi");	
	}

	@Override
	public void update(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitmen Hibernate ile Güncellendi");
	}

	@Override
	public void delete(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitmen Hibernate ile Silindi");	
	}

}
