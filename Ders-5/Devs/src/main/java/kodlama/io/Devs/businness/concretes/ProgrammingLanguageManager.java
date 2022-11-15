package kodlama.io.Devs.businness.concretes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import kodlama.io.Devs.businness.abstracts.ProgrammingLanguageServices;
import kodlama.io.Devs.businness.concretes.validate.abstracts.IEntityValidate;
import kodlama.io.Devs.businness.concretes.validate.concretes.BaseValidateManager;
import kodlama.io.Devs.businness.concretes.validate.tools.Messages;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.CreateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.UpdateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetAllProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetByIdProgramminLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetSubTechnologysProgrammingLanguage;
import kodlama.io.Devs.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.Devs.entity.ProgrammingLanguage;
import kodlama.io.Devs.entity.SubTechnology;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageServices
{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private Messages message = new Messages("Programlama Dili");
	private ModelMapper modelMapper;
	
	//constructorParameters
	public ProgrammingLanguageManager( ProgrammingLanguageRepository programmingLanguageRepository, ModelMapper modelMapper) 
	{
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.modelMapper = modelMapper;
	}
	
	//add
	@Override
	public void add(CreateProgrammingLanguage language) 
	{
		ProgrammingLanguage addProgrammingLanguage = modelMapper.map(language, ProgrammingLanguage.class);
		if(BaseValidateManager.add(getAllRepositoryIEntity(), addProgrammingLanguage, message)) 
		{
			programmingLanguageRepository.save(addProgrammingLanguage);
			message.print("successSave", language.getName());
		}
	}
	//update
	@Override
	public void update(UpdateProgrammingLanguage language) 
	{
		ProgrammingLanguage updateProgrammingLanguage = modelMapper.map(language, ProgrammingLanguage.class);
		if(BaseValidateManager.update(getAllRepositoryIEntity(), updateProgrammingLanguage, message)) 
		{
			programmingLanguageRepository.save(updateProgrammingLanguage);
			message.print("successUpdate", language.getName());
		}
	}
	
	//delete
	@Override
	public void delete(int id) 
	{
		if(BaseValidateManager.delete(getAllRepositoryIEntity(), id, message)) 
		{
			String name = (String)getById(id).getName();
			programmingLanguageRepository.deleteById(id);	
			message.print("successDelete", name);
		}
	}
	
	//getById
	@Override
	public GetByIdProgramminLanguage getById(int id) 
	{
		GetByIdProgramminLanguage returnProgrammingLanguage = null;
		if(BaseValidateManager.getById(getAllRepositoryIEntity(), id, message)) 
		{
			returnProgrammingLanguage = modelMapper.map(programmingLanguageRepository.findById(id).get(), GetByIdProgramminLanguage.class);
			message.print("successGet", returnProgrammingLanguage.getName());
		}
		return returnProgrammingLanguage;
	}
	
	//getSubTechonolgys
	@Override
	public List<GetSubTechnologysProgrammingLanguage> getSubTechonolgys(int id) 
	{
		List<GetSubTechnologysProgrammingLanguage> returnListDto = new ArrayList<GetSubTechnologysProgrammingLanguage>();
		if(BaseValidateManager.getById(getAllRepositoryIEntity(), id, message)) 
		{
			List<SubTechnology> subTechnologys =  programmingLanguageRepository.findById(id).get().getSubTechnologys();
			for(IEntityValidate arrayItem : subTechnologys) 
			{
				GetSubTechnologysProgrammingLanguage push = modelMapper.map(arrayItem, GetSubTechnologysProgrammingLanguage.class);
				push.setProgrammingLanguageId(id);
				push.setProgrammingLanguageName(programmingLanguageRepository.findById(id).get().getName());
				returnListDto.add(push);
			} 
			message.print("successGet", "Alt Teknolojiler");
		}
		return returnListDto;
	}

	//getAll
	@Override
	public List<GetAllProgrammingLanguage> getAll() 
	{	
		List<IEntityValidate> returnList = getAllRepositoryIEntity();
		if(BaseValidateManager.getAll(returnList, message)) 
		{	
			List<GetAllProgrammingLanguage> returnListDto =  
				returnList.stream().map(pl -> modelMapper.map(pl, GetAllProgrammingLanguage.class)).collect(Collectors.toList());
			 message.print("successGetAll", "("+returnList.size()+" adet kayıt)");
			 return returnListDto;
		}
		return null;
	}
	
	//Tools
	//getAllRepositoryIEntityValidate
	private List<IEntityValidate> getAllRepositoryIEntity() 
	{	
		return  
		programmingLanguageRepository.findAll().stream()
		.map(pl -> modelMapper.map(pl, IEntityValidate.class))
		.collect(Collectors.toList());
	}


	
	
}
