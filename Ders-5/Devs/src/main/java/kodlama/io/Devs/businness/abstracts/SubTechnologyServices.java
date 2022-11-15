package kodlama.io.Devs.businness.abstracts;
import java.util.List;
import kodlama.io.Devs.businness.dto.requests.subTechnology.CreateSubTechnology;
import kodlama.io.Devs.businness.dto.requests.subTechnology.UpdateSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetAllSubTechnology;
import kodlama.io.Devs.businness.dto.responses.subTechnology.GetByIdSubTechnology;

public interface SubTechnologyServices 
{

	void add(CreateSubTechnology createSubTechnology);
	void update(UpdateSubTechnology subTechnology);
	void delete(int id);
	List<GetAllSubTechnology> getAll();
	GetByIdSubTechnology getById(int id);
}
