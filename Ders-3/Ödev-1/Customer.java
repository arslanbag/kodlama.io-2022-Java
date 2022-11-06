
public class Customer 
{
	int id;
	String city;
	
	public Customer() 
	{
		System.out.println("Customer yapıcı blok başlatıldı");
	}

	//id
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	//city
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
