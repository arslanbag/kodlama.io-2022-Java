package kodlama.io.rentACar.businness.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import kodlama.io.rentACar.businness.abstracts.BrandServices;
import kodlama.io.rentACar.businness.requests.CreateBrandRequest;
import kodlama.io.rentACar.businness.responses.GetAllBrandsResponse;
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
	public List<GetAllBrandsResponse> getAll() 
	{
		List<GetAllBrandsResponse> returnGetAllBrandsResponse = new ArrayList<GetAllBrandsResponse>();
		List<Brand>  brands =  brandRepository.findAll();
		for (Brand arrayBrand :  brands) 
		{
			GetAllBrandsResponse memoryArray = new GetAllBrandsResponse();
			memoryArray.setId(arrayBrand.getId());
			memoryArray.setName(arrayBrand.getName());
			returnGetAllBrandsResponse.add(memoryArray);
		}
		return returnGetAllBrandsResponse;
	}

	@Override
	public void add(CreateBrandRequest crateBrandRequest) 
	{
		Brand brand = new Brand();
		brand.setName(crateBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}



}
