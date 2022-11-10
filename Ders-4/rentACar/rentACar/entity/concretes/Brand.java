package kodlama.io.rentACar.entity.concretes;

public class Brand 
{
	//field
		private int id;
		private String name;
		
		//constructor
		public Brand() {}
		
		//constructorParameters
		public Brand(int id, String name) 
		{
			this.id = id;
			this.name = name;
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

		//name
		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}
}
