package kodlama.io.Devs.businness.abstracts;
import java.util.List;
import kodlama.io.Devs.entity.ProgrammingLanguage;

public interface ProgrammingLanguageServices 
{
	void add(ProgrammingLanguage language);
	void update(ProgrammingLanguage language);
	void delete(int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
