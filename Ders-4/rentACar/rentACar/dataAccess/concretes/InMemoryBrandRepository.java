package kodlama.io.rentACar.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entity.concretes.Brand;

@Repository 
//InMemoryBrandRepository nin Repository olduğunu belirt 
//BrandRepository Referans tutucularına bu sınıf otomatik new'lenebilir
public class InMemoryBrandRepository implements BrandRepository
{
	//field
	List<Brand> brands;
	
	//constructor
	public InMemoryBrandRepository() 
	{
		brands = new ArrayList <Brand>();
		brands.add(new Brand(1,"Bwm"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Tofaş"));
		brands.add(new Brand(4,"Ferrari"));
		brands.add(new Brand(5,"Porshce"));
		brands.add(new Brand(6,"Land Rover"));
	}
	
	//getAll
	@Override
	public List<Brand> getAll() 
	{
		return brands;
	}

}
