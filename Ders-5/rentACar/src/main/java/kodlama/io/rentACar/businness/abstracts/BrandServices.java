package kodlama.io.rentACar.businness.abstracts;
import java.util.List;

import kodlama.io.rentACar.businness.requests.CreateBrandRequest;
import kodlama.io.rentACar.businness.responses.GetAllBrandsResponse;

public interface BrandServices 
{
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest brandRequest);
}
