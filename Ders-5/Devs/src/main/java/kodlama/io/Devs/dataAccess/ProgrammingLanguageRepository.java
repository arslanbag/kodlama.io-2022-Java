package kodlama.io.Devs.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.Devs.entity.ProgrammingLanguage;
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>
{}
