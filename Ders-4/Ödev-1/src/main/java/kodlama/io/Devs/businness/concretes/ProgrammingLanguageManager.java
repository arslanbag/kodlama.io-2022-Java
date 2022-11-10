package kodlama.io.Devs.businness.concretes;
import java.util.List;
import org.springframework.stereotype.Service;
import kodlama.io.Devs.businness.abstracts.ProgrammingLanguageServices;
import kodlama.io.Devs.businness.concretes.validate.ProgramLanguageValidateManager;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entity.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageServices
{
	//field
	ProgrammingLanguageRepository programmingLanguageRepository;
	
	//constructorParameters
	public ProgrammingLanguageManager( ProgrammingLanguageRepository programmingLanguageRepository ) 
	{
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public void add(ProgrammingLanguage language) 
	{
		//emptyName
		if(ProgramLanguageValidateManager.emptyNameCheck(language.getName()))
		{
			System.out.println("#! Programlama dilinin adı boş olamaz, kayıt başarısız");
		}
		//repeatName
		else if(ProgramLanguageValidateManager.repeatNameCheck(getAll(false), language.getName()))
		{
			System.out.println("#! ["+language.getName()+"] , adlı programlama dili listede mevcut, ekleme başarısız");
		}
		else 
		{
			programmingLanguageRepository.add(language);
			System.out.println("#+ ["+language.getName()+"] , adlı programlama dili eklendi");
		}
	}

	@Override
	public void update(ProgrammingLanguage language) 
	{
		//emptyName
		if(ProgramLanguageValidateManager.emptyNameCheck(language.getName()))
		{
			System.out.println("#! Programlama dilinin adı boş olamaz, güncelleme başarısız");
		}
		//notFoundProgrammingLanguage
		else if(!ProgramLanguageValidateManager.isLanguage(getAll(false),language.getId())) 
		{
			System.out.println("#! ["+language.getName()+ "] , adlı kayıt bulunamadı, güncelleme başarısız");
		}
		//repeatName
		else if( ProgramLanguageValidateManager.repeatNameCheckUpdate(getAll(false),  language.getName(), language.getId() ) )
		{
			System.out.println("#! ["+language.getName()+ "] , adlı programlama dili ismi listede mevcut, güncelleme başarısız");
		}
		//update
		else 
		{
			programmingLanguageRepository.update(language);
			System.out.println("#+ ["+language.getName()+"] , adlı  programlama dili güncellendi");
		}	
	}

	@Override
	public void delete(int id) 
	{
		//notFoundProgrammingLanguage
		if(!ProgramLanguageValidateManager.isLanguage(getAll(false),id)) 
		{
			System.out.println("#! ["+id+ "] , numaralı kayıt zaten yok, silme işlemi başarısız");
		}
		else 
		{
			String name = (String) programmingLanguageRepository.getById(id).getName();
			programmingLanguageRepository.delete(id);
			System.out.println("#+ ["+name+"] : adlı programlama dili silindi");
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() 
	{
		List<ProgrammingLanguage> returnList = programmingLanguageRepository.getAll();
		if(returnList != null)
			System.out.println("#+ Programlama dili listesi getirildi");
		else
			System.out.println("#+ Programlama dili listesi getirilemedi , başarısız");
		
		return returnList;
	}
	
	//systemMessageOptionGetAll
	public List<ProgrammingLanguage> getAll(boolean notString) 
	{
		List<ProgrammingLanguage> returnList = programmingLanguageRepository.getAll();
		if(notString)
			return getAll();
		else
			return returnList;
	}

	@Override
	public ProgrammingLanguage getById(int id) 
	{
		ProgrammingLanguage returnProgrammingLanguage = programmingLanguageRepository.getById(id);
		if(returnProgrammingLanguage == null)
			System.out.println("#! Programlama dili bulunamadı");
		else
			System.out.println("#+ ["+returnProgrammingLanguage.getName() + "], adlı Programlama dili getirildi");
		return returnProgrammingLanguage;
	}
	
}
