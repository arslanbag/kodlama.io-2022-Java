package kodlama.io.Devs.businness.dto.responses.programmingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSubTechnologysProgrammingLanguage 
{
	private int ProgrammingLanguageId;
	private int id;
	private String name;
	private String ProgrammingLanguageName;
}
