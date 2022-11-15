package kodlama.io.Devs.webApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.Devs.businness.abstracts.ProgrammingLanguageServices;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.CreateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.UpdateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetAllProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetByIdProgramminLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetSubTechnologysProgrammingLanguage;

@RestController
@RequestMapping("api/programlanguages")
public class ProgramLanguageController  
{
	//field
	private ProgrammingLanguageServices programmingLanguageServices;
	
	//constructorParameters
	@Autowired
	public ProgramLanguageController(ProgrammingLanguageServices programmingLanguageServices) 
	{
		this.programmingLanguageServices = programmingLanguageServices;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguage language) 
	{
		programmingLanguageServices.add(language);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguage language) 
	{
		programmingLanguageServices.update(language);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		programmingLanguageServices.delete(id);
	}
	
	@GetMapping("/get/all")
	public List<GetAllProgrammingLanguage> getAll() 
	{
		return programmingLanguageServices.getAll();
	}
	
	@GetMapping("/get/{id}")
	public GetByIdProgramminLanguage getById(@PathVariable(name = "id") int id ) 
	{
		return programmingLanguageServices.getById(id);
	}
	
	@GetMapping("/get/{id}/subtechnology")
	public List<GetSubTechnologysProgrammingLanguage> getSubTechonolgys(@PathVariable(name = "id") int id ) 
	{
		return programmingLanguageServices.getSubTechonolgys(id);
	}
	

	
}
