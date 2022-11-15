package kodlama.io.Devs.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import kodlama.io.Devs.businness.concretes.validate.abstracts.IEntityValidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="PLSubTechnology")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
public class SubTechnology  implements IEntityValidate
{
	//field
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="programlanguage_fk")
	ProgrammingLanguage programmingLanguage;
	
}
