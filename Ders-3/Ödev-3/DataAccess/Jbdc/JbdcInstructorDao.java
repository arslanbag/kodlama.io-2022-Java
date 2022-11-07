package DataAccess.Jbdc;
import DataAccess.InstructorDao;
import Entities.Instructor;

public class JbdcInstructorDao implements InstructorDao
{

	@Override
	public void add(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitimen Jbdc ile Eklendi");	
	}

	@Override
	public void update(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitmen Jbdc ile Güncellendi");
	}

	@Override
	public void delete(Instructor instructor) 
	{
		System.out.println("#-"+instructor.getName()+"-"+instructor.getLastName()+" adlı Eğitmen Jbdc ile Silindi");	
	}



}
