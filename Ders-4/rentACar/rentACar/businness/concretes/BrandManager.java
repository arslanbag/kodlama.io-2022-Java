package kodlama.io.rentACar.businness.concretes;
import java.util.List;

import org.springframework.stereotype.Service;
import kodlama.io.rentACar.businness.abstracts.BrandServices;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entity.concretes.Brand;

@Service 
//Brand Manager'ın Services olduğunu belirt
//BrandServices Referans tutucularına bu sınıf otomatik new'lenebilir
public class BrandManager implements BrandServices
{
	//field
	private BrandRepository brandRepository;
	
	//constructorParameters
	public BrandManager(BrandRepository brandRepository) 
	{
		this.brandRepository = brandRepository;
	}
	
	//businnessGetAll
	@Override
	public List<Brand> getAll() 
	{
		//iş kuralları
		return brandRepository.getAll();
	}

}
