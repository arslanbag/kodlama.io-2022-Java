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
import kodlama.io.Devs.entity.ProgrammingLanguage;

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
	public void add(@RequestBody ProgrammingLanguage language) 
	{
		programmingLanguageServices.add(language);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage language) 
	{
		programmingLanguageServices.update(language);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		programmingLanguageServices.delete(id);
	}
	
	@GetMapping("/get/all")
	public List<ProgrammingLanguage> getAll() 
	{
		return programmingLanguageServices.getAll();
	}
	
	@GetMapping("/get/{id}")
	public ProgrammingLanguage getById(@PathVariable (name = "id") int id ) 
	{
		return programmingLanguageServices.getById(id);
	}
	
	
	
}
