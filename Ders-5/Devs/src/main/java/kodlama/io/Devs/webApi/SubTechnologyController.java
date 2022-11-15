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
import kodlama.io.Devs.businness.abstracts.SubTechnologyServices;
import kodlama.io.Devs.businness.dto.requests.subTechnology.CreateSubTechnology;
import kodlama.io.Devs.businness.dto.requests.subTechnology.UpdateSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetAllSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetByIdSubTechnology;

@RestController
@RequestMapping("api/subTechnologys")
public class SubTechnologyController  
{
	//field
	private SubTechnologyServices subTechnologyServices;
	
	//constructorParameters
	@Autowired
	public SubTechnologyController(SubTechnologyServices subTechnologyServices) 
	{
		this.subTechnologyServices = subTechnologyServices;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateSubTechnology createSubTechnology) 
	{
		subTechnologyServices.add(createSubTechnology);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateSubTechnology subTechnology) 
	{
		subTechnologyServices.update(subTechnology);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		subTechnologyServices.delete(id);
	}
	
	@GetMapping("/get/all")
	public List<GetAllSubTechnology> getAll() 
	{
		return subTechnologyServices.getAll();
	}
	
	@GetMapping("/get/{id}")
	public GetByIdSubTechnology getById( int id ) 
	{
		return subTechnologyServices.getById(id);
	}
	

	
	
	
}
