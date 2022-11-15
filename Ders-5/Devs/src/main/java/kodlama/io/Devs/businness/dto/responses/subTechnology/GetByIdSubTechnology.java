package kodlama.io.Devs.businness.dto.responses.subTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSubTechnology 
{
	private int id;
	private String name;
	private String ProgrammingLanguageName;
	private int ProgrammingLanguageId;
}
