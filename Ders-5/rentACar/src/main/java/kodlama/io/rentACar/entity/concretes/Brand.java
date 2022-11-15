package kodlama.io.rentACar.entity.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data //@Data tamamı(get+set) @Getter @Setter ,  ayrı ayrı getter ve setter leri oluşturur
@NoArgsConstructor //constructor
@AllArgsConstructor //constructorParameters
@Entity //Brand class veritabanı varlığıdır
public class Brand 
{
	//field
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		

}
