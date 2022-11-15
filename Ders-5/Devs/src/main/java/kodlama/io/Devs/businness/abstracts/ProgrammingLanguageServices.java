package kodlama.io.Devs.businness.abstracts;
import java.util.List;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.CreateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.requests.programmingLanguage.UpdateProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetAllProgrammingLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetByIdProgramminLanguage;
import kodlama.io.Devs.businness.dto.responses.programmingLanguage.GetSubTechnologysProgrammingLanguage;

public interface ProgrammingLanguageServices
{
	void add(CreateProgrammingLanguage language);
	void update(UpdateProgrammingLanguage language);
	void delete(int id);
	List<GetAllProgrammingLanguage> getAll();
	GetByIdProgramminLanguage getById(int id);
	List<GetSubTechnologysProgrammingLanguage> getSubTechonolgys(int id);
}
