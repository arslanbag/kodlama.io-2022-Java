package kodlama.io.Devs.businness.dto.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnology 
{
	
	private int id;
	private String name;
	private int ProgrammingLanguageId;
}
