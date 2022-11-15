package kodlama.io.Devs.businness.dto.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechnology 
{
	private String name;
	private int ProgrammingLanguageId;
}
