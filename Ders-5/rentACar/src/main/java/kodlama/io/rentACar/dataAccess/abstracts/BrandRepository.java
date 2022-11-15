package kodlama.io.rentACar.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.rentACar.entity.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>//Brand Id ve türü(Integer)
{

}
