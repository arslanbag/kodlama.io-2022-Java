package kodlama.io.Devs.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entity.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository
{
	//field
	List<ProgrammingLanguage> languages;
	
	//constructorParameters
	public InMemoryProgrammingLanguage() 
	{
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "C#"));
		languages.add(new ProgrammingLanguage(3, "Pyhton"));
		languages.add(new ProgrammingLanguage(4, "Php"));
	}
	
		
	@Override
	public void add(ProgrammingLanguage language) 
	{
		languages.add(language);
	}
	

	@Override
	public void update(ProgrammingLanguage language) 
	{	
		languages.remove(getById(language.getId()));
		languages.add(language);
		
	}

	@Override
	public void delete(int id) 
	{
		languages.remove(getById(id));
	}

	@Override
	public List<ProgrammingLanguage> getAll() 
	{
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) 
	{
		ProgrammingLanguage returnLangue = null ;
		for(ProgrammingLanguage arrayLangues : languages)
		{
			if(arrayLangues.getId() == id) 
			{
				returnLangue =  arrayLangues;
			}
		}
		return returnLangue;
				
	}

}
