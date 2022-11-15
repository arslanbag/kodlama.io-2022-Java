package kodlama.io.Devs.businness.concretes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import kodlama.io.Devs.businness.abstracts.SubTechnologyServices;
import kodlama.io.Devs.businness.concretes.validate.abstracts.IEntityValidate;
import kodlama.io.Devs.businness.concretes.validate.concretes.BaseValidateManager;
import kodlama.io.Devs.businness.concretes.validate.tools.Messages;
import kodlama.io.Devs.businness.dto.requests.subTechnology.CreateSubTechnology;
import kodlama.io.Devs.businness.dto.requests.subTechnology.UpdateSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetAllSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetByIdSubTechnology;
import kodlama.io.Devs.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.Devs.dataAccess.SubTechnologyRepository;
import kodlama.io.Devs.entity.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyServices
{
	private SubTechnologyRepository subTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private Messages message = new Messages("Alt Programlama Teknolojisi");
	private ModelMapper modelMapper;
	
	//constructorParameters
	public SubTechnologyManager( SubTechnologyRepository subTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository, ModelMapper modelMapper) 
	{
		this.subTechnologyRepository = subTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.modelMapper = modelMapper;
	}
	
	//add
	@Override
	public void add(CreateSubTechnology createSubTechnology) 
	{
		SubTechnology subTechnology = modelMapper.map(createSubTechnology, SubTechnology.class);
		if(BaseValidateManager.add(getAllRepositoryIEntity(), subTechnology, message)) 
		{
			subTechnology = updateProgramminLanguage(subTechnology,createSubTechnology.getProgrammingLanguageId());
			subTechnologyRepository.save(subTechnology);
			message.print("successSave", subTechnology.getName());
		}
	}
	//update
	@Override
	public void update(UpdateSubTechnology updateSubTechnology) 
	{
		SubTechnology subTechnology = modelMapper.map(updateSubTechnology, SubTechnology.class);
		if(BaseValidateManager.update(getAllRepositoryIEntity(), subTechnology, message)) 
		{
			subTechnology = updateProgramminLanguage(subTechnology,updateSubTechnology.getProgrammingLanguageId());
			subTechnologyRepository.save(subTechnology);
			message.print("successUpdate", subTechnology.getName());
		}
	}
	
	//delete
	@Override
	public void delete(int id) 
	{
		if(BaseValidateManager.delete(getAllRepositoryIEntity(), id, message)) 
		{
			String subTechnologyName = (String)getById(id).getName();
			subTechnologyRepository.deleteById(id);	
			message.print("successDelete", subTechnologyName);
		}
	}
	
	//getById
	@Override
	public GetByIdSubTechnology getById(int id) 
	{
		GetByIdSubTechnology subTechnology = null;
		if(BaseValidateManager.getById(getAllRepositoryIEntity(), id, message)) 
		{
			SubTechnology subTechnologyData = subTechnologyRepository.findById(id).get();
			subTechnology = modelMapper.map(subTechnologyRepository.findById(id).get(), GetByIdSubTechnology.class);
			subTechnology.setProgrammingLanguageId(subTechnologyData.getProgrammingLanguage().getId());
			subTechnology.setProgrammingLanguageName(subTechnologyData.getProgrammingLanguage().getName());
			message.print("successGet", subTechnology.getName());
		}
		return subTechnology;
	}
	
	//getAll
	@Override
	public List<GetAllSubTechnology> getAll() 
	{	
		List<IEntityValidate> subTechnologys = getAllRepositoryIEntity();
		if(BaseValidateManager.getAll(subTechnologys, message)) 
		{	
			List<GetAllSubTechnology> returnListDto = new ArrayList<GetAllSubTechnology>();;
			for(IEntityValidate arrayItem : subTechnologys) 
			{
				SubTechnology subTechnologyData = subTechnologyRepository.findById(arrayItem.getId()).get();
				GetAllSubTechnology push = modelMapper.map(arrayItem, GetAllSubTechnology.class);
				push.setProgrammingLanguageId(subTechnologyData.getProgrammingLanguage().getId());
				push.setProgrammingLanguageName(subTechnologyData.getProgrammingLanguage().getName());
				returnListDto.add(push);
			}  
			
			message.print("successGetAll", "("+subTechnologys.size()+" adet kayıt)");
			return returnListDto;
		}
		return null;
	}
	
	//Tools
	//getAllRepositoryIEntityValidate
	private List<IEntityValidate> getAllRepositoryIEntity() 
	{	
		return  
		subTechnologyRepository.findAll().stream()
		.map(pl -> modelMapper.map(pl, IEntityValidate.class))
		.collect(Collectors.toList());
	}
	
	
	//update ProgrammingLangues
	private SubTechnology updateProgramminLanguage(SubTechnology subTechnology,int id) 
	{
		subTechnology.setProgrammingLanguage(programmingLanguageRepository.findById(id).get());
		return subTechnology;
	}
}
