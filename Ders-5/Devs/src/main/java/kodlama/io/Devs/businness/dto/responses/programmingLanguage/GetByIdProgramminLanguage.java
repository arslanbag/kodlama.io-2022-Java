package kodlama.io.Devs.businness.dto.responses.programmingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgramminLanguage 
{
	private int id;
	private String name;
}
